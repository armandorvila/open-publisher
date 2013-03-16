package com.armandorv.publisher.client.application;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.armandorv.publisher.business.ArticlesService;
import com.armandorv.publisher.business.AuthorsService;
import com.armandorv.publisher.client.util.Properties;

/**
 * This factory get the service beans from Spring Context, Spring Context get
 * the business beans from jndi reggistry of jboss.
 * 
 * @author armandorv
 * 
 */
public class EJBFactory {

	public static EJBFactory FACTORY = new EJBFactory();

	private EJBFactory() {
	}

	public ArticlesService getArticlesService() {
		try {
			return (ArticlesService) new InitialContext().lookup(Properties
					.getArticleEjbName());
		} catch (NamingException e) {
			return null;
		}
	}

	public AuthorsService getAuthorsService() {
		try {
			return (AuthorsService) new InitialContext().lookup(Properties
					.getAuthorsEjbName());
		} catch (NamingException e) {
			e.printStackTrace();
			return null;
		}
	}

}
