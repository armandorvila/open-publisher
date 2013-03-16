package com.armandorv.publisher.presentation.load;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.security.core.context.SecurityContextHolder;

import com.armandorv.publisher.application.BusinessFactory;
import com.armandorv.publisher.business.ArticlesService;
import com.armandorv.publisher.model.Article;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoadHomeAction extends ActionSupport {

	private static final long serialVersionUID = 4117916166003941307L;
	private Logger log = Logger.getLogger(LoadHomeAction.class);
	private ArticlesService service = BusinessFactory.FACTORY
			.getArticlesService();

	private List<Article> articles;

	public String execute() {
		try {
		
			SecurityContextHolder.createEmptyContext();
			articles = service.getAllArticles();
			log.info("Getting Articles:" + articles);
			this.manageAplicationContext();
			return SUCCESS;

		} catch (Throwable e) {
			log.error(e.getMessage());
			return ERROR;
		}
	}
	
	public void validate(){
		if(super.hasFieldErrors()){
			this.execute();
		}
	}

	@SuppressWarnings("unchecked")
	private void manageAplicationContext() {
		Map<String, Object> context = ActionContext.getContext()
				.getApplication();
		if (!context.containsKey("initialized")) {
			context.put("visitCounter", 0);
			context.put("fileCounter", 0);
			context.put("initialized", "true");
		} else {
			int count = (Integer) context.get("visitCounter");
			count++;
			context.put("visitCounter", count);
		}
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public List<Article> getArticles() {
		return articles;
	}

}
