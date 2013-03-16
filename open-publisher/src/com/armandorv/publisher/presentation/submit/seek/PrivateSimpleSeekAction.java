package com.armandorv.publisher.presentation.submit.seek;

import java.util.List;

import org.apache.log4j.Logger;

import com.armandorv.publisher.application.ApplicationFactory;
import com.armandorv.publisher.application.browsers.ArticlesBrowser;
import com.armandorv.publisher.model.Article;
import com.armandorv.publisher.model.Author;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class PrivateSimpleSeekAction extends ActionSupport {

	private static final long serialVersionUID = 4924489495046616871L;
	private Logger log = Logger.getLogger(PrivateSimpleSeekAction.class);
	private ArticlesBrowser browser = ApplicationFactory.FACTORY
			.getArticlesBrowser();

	private String key;
	private List<Article> articles;

	public String execute() {
		try {
			Author author = (Author) ActionContext.getContext().getSession().get("author");
			this.articles = browser.getArticlesByKeyWord(author.getId() , key);
			
			return SUCCESS;
		} catch (Throwable e) {
			log.error(e.getMessage());
			return ERROR;
		}
	}

	public void setKey(String key) {
		this.key = key;
	}
	@RequiredStringValidator(fieldName = "key", message = "", key = "seek.simple.error", shortCircuit = true, trim = true)
	public String getKey() {
		return key;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public List<Article> getArticles() {
		return articles;
	}
}
