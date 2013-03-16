package com.armandorv.publisher.presentation.load.article;

import org.apache.log4j.Logger;

import com.armandorv.publisher.application.BusinessFactory;
import com.armandorv.publisher.business.ArticlesService;
import com.armandorv.publisher.model.Article;
import com.opensymphony.xwork2.ActionSupport;

public class LoadArticleDetailsAction extends ActionSupport {

	private static final long serialVersionUID = -5619881374358382713L;
	private Logger log = Logger.getLogger(LoadArticleDetailsAction.class);
	private ArticlesService service = BusinessFactory.FACTORY
			.getArticlesService();

	private long idArticle;
	private Article article;

	public String execute() {
		try {

			this.setArticle(this.service.getArticleByID(idArticle));

			return SUCCESS;
		} catch (Throwable e) {
			log.error(e.getMessage());
			return ERROR;
		}
	}

	public void setIdArticle(long idArticle) {
		this.idArticle = idArticle;
	}

	public long getIdArticle() {
		return idArticle;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Article getArticle() {
		return article;
	}

}
