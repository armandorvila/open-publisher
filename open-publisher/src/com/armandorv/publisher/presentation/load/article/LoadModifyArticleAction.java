package com.armandorv.publisher.presentation.load.article;

import org.apache.log4j.Logger;

import com.armandorv.publisher.application.BusinessFactory;
import com.armandorv.publisher.business.ArticlesService;
import com.armandorv.publisher.model.Article;
import com.opensymphony.xwork2.ActionSupport;

public class LoadModifyArticleAction extends ActionSupport {

	private static final long serialVersionUID = 2001084271514653878L;
	private static Logger log = Logger.getLogger(LoadModifyArticleAction.class);
	private ArticlesService service = BusinessFactory.FACTORY
			.getArticlesService();

	private long idArticle;
	private Article article;

	public String execute() {

		try {

			this.article = service.getArticleByID(idArticle);

			return SUCCESS;

		} catch (Throwable e) {
			log.error(e.getMessage());
			return ERROR;
		}
	}

	public long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(long idArticle) {
		this.idArticle = idArticle;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}


}
