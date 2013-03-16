package com.armandorv.publisher.presentation.submit.article;

import org.apache.log4j.Logger;

import com.armandorv.publisher.application.BusinessFactory;
import com.armandorv.publisher.business.ArticlesService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteArticleAction extends ActionSupport {

	private static final long serialVersionUID = -8909107509999217857L;
	private static Logger log = Logger.getLogger(DeleteArticleAction.class);
	private ArticlesService service = BusinessFactory.FACTORY
	.getArticlesService();
	
	private long idArticle;
	
	public String execute() {

		try {
			service.deleteArticle(idArticle);
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
}
