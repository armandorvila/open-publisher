package com.armandorv.publisher.presentation.submit.seek;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import com.armandorv.publisher.application.ApplicationFactory;
import com.armandorv.publisher.application.browsers.ArticlesBrowser;
import com.armandorv.publisher.model.Article;
import com.armandorv.publisher.model.Author;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PrivateAdvancedSeekAction extends ActionSupport {

	private static final long serialVersionUID = 8924318529626133271L;
	private static Logger log = Logger
			.getLogger(PrivateAdvancedSeekAction.class);
	private ArticlesBrowser browser = ApplicationFactory.FACTORY
			.getArticlesBrowser();

	private Set<Article> articles;
	private String title;
	private String subject;



	public String execute() {

		try {
			Author author = (Author) ActionContext.getContext().getSession()
					.get("author");
			this.articles = new HashSet<Article>();
			if(!title.equals(""))
			articles.addAll(browser.getArticlesByTitle(author.getId(), title));
			if(!subject.equals(""))
			articles.addAll(browser.getArticlesBySubject(author.getId(),
					subject));

			return SUCCESS;

		} catch (Throwable e) {
			log.error(e.getMessage());
			return ERROR;
		}
	}
	
	public void validate(){
		if (title.equals("") && subject.equals("")) {
			super.addActionError(super.getText("advanced.seek.error"));
		}
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

	public Set<Article> getArticles() {
		return articles;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
