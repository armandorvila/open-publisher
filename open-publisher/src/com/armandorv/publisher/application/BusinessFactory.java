package com.armandorv.publisher.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.armandorv.publisher.business.ArticlesService;
import com.armandorv.publisher.business.AuthorsService;

/**
 * This factory get the service beans from Spring Context, Spring Context get
 * the business beans from jndi reggistry of jboss.
 * 
 * @author armandorv
 * 
 */
public class BusinessFactory {

	public static BusinessFactory FACTORY = new BusinessFactory();
	private ApplicationContext context = new ClassPathXmlApplicationContext(
			"ejbBeans.xml");

	private BusinessFactory() {
	}

	public ArticlesService getArticlesService() {
		return context.getBean("ejbArticlesService", ArticlesService.class);
	}

	public AuthorsService getAuthorsService() {
		return context.getBean("ejbAuthorsService", AuthorsService.class);
	}

}
