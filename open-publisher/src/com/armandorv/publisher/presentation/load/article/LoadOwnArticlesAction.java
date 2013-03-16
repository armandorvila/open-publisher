package com.armandorv.publisher.presentation.load.article;

import java.util.List;

import org.apache.log4j.Logger;

import com.armandorv.publisher.application.BusinessFactory;
import com.armandorv.publisher.business.ArticlesService;
import com.armandorv.publisher.model.Article;
import com.armandorv.publisher.model.Author;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoadOwnArticlesAction extends ActionSupport {

	private static final long serialVersionUID = -5945736302023154157L;
	public static Logger log = Logger
			.getLogger(LoadOwnArticlesAction.class);
	private ArticlesService service = BusinessFactory.FACTORY
			.getArticlesService();
	private List<Article> articles;

	public String execute() {
		try {

			Author author = (Author) ActionContext.getContext().getSession()
					.get("author");
			this.articles = service.getAllArticlesOfAuthor(author.getId());
			return SUCCESS;

		} catch (Throwable e) {
			log.error(e.getMessage());
			return ERROR;
		}
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public List<Article> getArticles() {
		return articles;
	}
}
