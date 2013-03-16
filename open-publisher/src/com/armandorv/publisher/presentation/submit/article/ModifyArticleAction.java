package com.armandorv.publisher.presentation.submit.article;

import org.apache.log4j.Logger;

import com.armandorv.publisher.application.BusinessFactory;
import com.armandorv.publisher.business.ArticlesService;
import com.armandorv.publisher.model.Article;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class ModifyArticleAction extends ActionSupport {

	private static final long serialVersionUID = -4173724179749275121L;
	private static Logger log = Logger.getLogger(ModifyArticleAction.class);
	private ArticlesService service = BusinessFactory.FACTORY
			.getArticlesService();

	private long idArticle;
	private String name;
	private String subject;
	private String description;


	public String execute() {

		try {
			service.modifyArticle(this.getArticle());

			return SUCCESS;

		} catch (Throwable e) {
			log.error(e.getMessage());
			return ERROR;
		}
	}

	private Article getArticle() {
		Article article = service.getArticleByID(idArticle);

		article.setId(idArticle);
		article.setTitle(name);
		article.setSubject(subject);
		article.setDescription(description);

		return article;
	}

	@RequiredStringValidator(fieldName = "name", message = "", key = "modify.article.name.error", shortCircuit = true, trim = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@RequiredStringValidator(fieldName = "description", message = "", key = "modify.article.description.error", shortCircuit = true, trim = true)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@RequiredStringValidator(fieldName = "subject", message = "", key = "modify.article.subject.error", shortCircuit = true, trim = true)
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


	public long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(long idArticle) {
		this.idArticle = idArticle;
	}

}
