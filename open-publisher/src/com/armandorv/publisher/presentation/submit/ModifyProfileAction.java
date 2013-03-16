package com.armandorv.publisher.presentation.submit;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.armandorv.publisher.application.BusinessFactory;
import com.armandorv.publisher.business.AuthorsService;
import com.armandorv.publisher.model.Author;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class ModifyProfileAction extends ActionSupport implements
		ServletRequestAware {

	private static final long serialVersionUID = 1728235158851333897L;
	private static Logger log = Logger.getLogger(ModifyProfileAction.class);
	private AuthorsService service = BusinessFactory.FACTORY.getAuthorsService();
	
	private String name;
	private String surname;
	private HttpServletRequest request;

	public String execute() {

		try {
			Author author = (Author) request.getSession()
					.getAttribute("author");
			author.setName(this.name);
			author.setSurname(surname);
			service.modifyAuthor(author);

			return SUCCESS;
		} catch (Throwable e) {
			log.error(e.getMessage());
			return ERROR;
		}
	}

	@RequiredStringValidator(fieldName = "name", message = "", key = "modify.profile.name.error", shortCircuit = true, trim = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@RequiredStringValidator(fieldName = "surname", message = "", key = "modify.profile.surname.error", shortCircuit = true, trim = true)
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;

	}

}
