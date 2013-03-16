package com.armandorv.publisher.presentation.submit.seek;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Necesito un input condicionado, o sea que en unos casos vaya a un sitio y en
 * otros a otro pero que siga siendo una salida de error, para eso cuando m e de el input lo mando a este action,
 * este mira la salida y deja el mensaje en el value stack;
 * 
 * @author armandorv
 * 
 */
public class PublicSeekActionDecorator extends ActionSupport {

	private static final long serialVersionUID = 1976769619048272076L;

	private String message;

	public String execute() {
		try {

			this.message = super.getText("seek.simple.error");

			if (ActionContext.getContext().getSession().get("author") != null)
				return "logued";

			else
				return "notLogued";
		} catch (Throwable e) {
			return ERROR;
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
