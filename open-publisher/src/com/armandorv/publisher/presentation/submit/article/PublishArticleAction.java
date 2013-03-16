package com.armandorv.publisher.presentation.submit.article;

import java.io.File;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.armandorv.publisher.application.ApplicationFactory;
import com.armandorv.publisher.application.BusinessFactory;
import com.armandorv.publisher.application.helpers.FileHelper;
import com.armandorv.publisher.business.ArticlesService;
import com.armandorv.publisher.model.Article;
import com.armandorv.publisher.model.Author;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class PublishArticleAction extends ActionSupport implements
		ServletRequestAware {

	private static final long serialVersionUID = -4861490723047986962L;
	private static Logger log = Logger.getLogger(PublishArticleAction.class);
	private ArticlesService articlesService = BusinessFactory.FACTORY
			.getArticlesService();
	private FileHelper helper = ApplicationFactory.FACTORY.getFileHelper();

	private String title;
	private String subject;
	private String description;

	private File newFile;
	private String newFileFileName;
	private HttpServletRequest request;

	public String execute() {
		try {
			Author author = (Author) request.getSession()
					.getAttribute("author");
			Article article = this.getArticle();
			article.setAuthor(author.getName());
			helper.saveFile(article.getFileName(), newFile);
			articlesService.publishArticle(author.getId(), article);

			return SUCCESS;

		} catch (Throwable e) {
			log.error(e.getMessage());
			return ERROR;
		}
	}

	private Article getArticle() {
		Article article = new Article();

		article.setTitle(title);
		article.setSubject(subject);
		article.setDescription(description);
		article.setFileName(this.getFileCount() + "_" + newFileFileName);
		article.setUrl(this.helper.getBaseFileUrl() + article.getFileName());
		article.setDateOfCreation(new Date());

		return article;
	}

	@SuppressWarnings("unchecked")
	private int getFileCount() {
		int count = (Integer) ActionContext.getContext().getApplication()
				.get("fileCounter");
		ActionContext.getContext().getApplication().put("fileCounter", count + 1);
		return count;
	}

	public void validate() {
		if (this.newFile == null || this.newFileFileName == null) {
			super.addFieldError("file", super.getText("publish.file.error"));
		}
		if ("".equals(this.newFileFileName)) {
			super.addFieldError("file", super.getText("publish.file.error"));
		}

	}

	@RequiredStringValidator(fieldName = "title", message = "", key = "publish.name.error", shortCircuit = true, trim = true)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@RequiredStringValidator(fieldName = "description", message = "", key = "publish.description.error", shortCircuit = true, trim = true)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@RequiredStringValidator(fieldName = "sbject", message = "", key = "publish.subject.error", shortCircuit = true, trim = true)
	public String getSubject() {
		return subject;
	}

	public void setNewFileFileName(String newFileFileName) {
		this.newFileFileName = newFileFileName;
	}

	public String getNewFileFileName() {
		return newFileFileName;
	}

	public void setNewFile(File newFile) {
		this.newFile = newFile;
	}

	public File getNewFile() {
		return newFile;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;

	}

}
