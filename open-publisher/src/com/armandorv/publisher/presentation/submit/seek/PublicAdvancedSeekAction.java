package com.armandorv.publisher.presentation.submit.seek;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import com.armandorv.publisher.application.ApplicationFactory;
import com.armandorv.publisher.application.browsers.ArticlesBrowser;
import com.armandorv.publisher.model.Article;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PublicAdvancedSeekAction extends ActionSupport {

	private static final long serialVersionUID = 8924318529626133271L;
	private static Logger log = Logger
			.getLogger(PublicAdvancedSeekAction.class);
	private ArticlesBrowser browser = ApplicationFactory.FACTORY
			.getArticlesBrowser();

	private Set<Article> articles;
	private String title;
	private String subject;
	private String author;

	public String execute() {

		try {

			this.articles = new HashSet<Article>();
			if (!title.equals(""))
				articles.addAll(browser.getArticlesByTitle(title));
			if (!subject.equals(""))
				articles.addAll(browser.getArticlesBySubject(subject));
			if (!author.equals(""))
				articles.addAll(browser.getArticlesByAuthorName(author));

			if (ActionContext.getContext().getSession().get("author") != null)
				return "logued";

			return SUCCESS;

		} catch (Throwable e) {
			log.error(e.getMessage());
			return ERROR;
		}
	}

	public void validate() {
		if (title.equals("") && author.equals("") && subject.equals("")) {
			super.addActionError(super.getText("advanced.seek.error"));
			if (ActionContext.getContext().getSession().get("author") != null)
				ActionContext.getContext().getActionInvocation()
						.setResultCode("logued");

		}
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

	public Set<Article> getArticles() {
		return articles;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}
}
