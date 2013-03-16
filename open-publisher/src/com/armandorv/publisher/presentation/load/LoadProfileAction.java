package com.armandorv.publisher.presentation.load;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.security.core.context.SecurityContextHolder;

import com.armandorv.publisher.application.BusinessFactory;
import com.armandorv.publisher.business.AuthorsService;
import com.armandorv.publisher.model.Author;
import com.opensymphony.xwork2.ActionSupport;

public class LoadProfileAction extends ActionSupport implements
		ServletRequestAware {

	private static final long serialVersionUID = 6579205834972431400L;
	private static Logger log = Logger.getLogger(LoadProfileAction.class);
	private AuthorsService service = BusinessFactory.FACTORY
			.getAuthorsService();

	private Author author;
	private HttpServletRequest request;

	public String execute() {

		try {
			String username = SecurityContextHolder.getContext()
					.getAuthentication().getName();

			this.author = service.getAuthorByuserName(username);

			request.getSession().setAttribute("author", author);

			return SUCCESS;

		} catch (Throwable e) {
			log.error(e.getMessage());
			return ERROR;
		}
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Author getAuthor() {
		return author;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;

	}

}
