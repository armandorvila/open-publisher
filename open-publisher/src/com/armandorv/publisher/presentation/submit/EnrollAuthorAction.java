package com.armandorv.publisher.presentation.submit;

import java.util.Date;

import org.apache.log4j.Logger;

import com.armandorv.publisher.application.BusinessFactory;
import com.armandorv.publisher.business.AuthorsService;
import com.armandorv.publisher.model.Author;
import com.armandorv.publisher.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class EnrollAuthorAction extends ActionSupport {

	private static final long serialVersionUID = 8590115228906316162L;
	private static Logger log = Logger.getLogger(EnrollAuthorAction.class);
	private AuthorsService service = BusinessFactory.FACTORY
			.getAuthorsService();

	private String name;
	private String surname;
	private String username;
	private String password;
	private String passwordConfirm;

	public String execute() {
		try {
	
			service.enrollAuthor(this.createUser(), this.createAuthor());
			return SUCCESS;

		} catch (Throwable e) {

			log.error(e.getMessage());
			return ERROR;
		}
	}

	public void validate() {

		if (username == null || "".equals(username)) {
			super.addFieldError("username",
					super.getText("register.username.error"));
		}
		if (password == null || "".equals(password)) {
			super.addFieldError("password",
					super.getText("register.password.error"));
		}

		if (passwordConfirm == null || "".equals(passwordConfirm)) {
			super.addFieldError("passwordConfirm",
					super.getText("register.password_confirm.error"));
		}
		
		else if (service.getAuthorByuserName(username) != null) {
			super.addFieldError("username",
					super.getText("register.username.error.repeated"));
		}
		else if (!password.equals(passwordConfirm)) {
			super.addFieldError("passwordConfirm",
					super.getText("register.password_confirm.error.distinct"));
		}
	}

	private User createUser() {
		User user = new User();
		user.setUserName(username);
		user.setPassword(password);
		return user;
	}

	private Author createAuthor() {
		Author author = new Author();

		author.setName(name);
		author.setSurname(surname);
		author.setDateOfJoining(new Date());

		return author;
	}

	@RequiredStringValidator(fieldName = "name", message = "", key = "register.name.error", shortCircuit = true, trim = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@RequiredStringValidator(fieldName = "surname", message = "", key = "register.surname.error", shortCircuit = true, trim = true)
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

}
