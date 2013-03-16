package com.armandorv.publisher.presentation.submit;

import org.apache.log4j.Logger;
import org.springframework.security.core.context.SecurityContextHolder;


import com.armandorv.publisher.application.BusinessFactory;
import com.armandorv.publisher.business.AuthorsService;
import com.armandorv.publisher.model.Author;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteProfileAction extends ActionSupport {

	private static final long serialVersionUID = -4831863237229984888L;
	private static Logger log = Logger.getLogger(DeleteProfileAction.class);
	private AuthorsService service = BusinessFactory.FACTORY.getAuthorsService();
	
	public String execute() {

		Author author = (Author) ActionContext.getContext().getSession()
				.get("author");
		service.deleteAuthor(author.getId());
		SecurityContextHolder.clearContext();

		try {
			return SUCCESS;
		} catch (Throwable e) {
			log.error(e.getMessage());
			return ERROR;
		}
	}

}
