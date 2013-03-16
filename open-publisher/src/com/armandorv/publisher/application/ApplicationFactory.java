package com.armandorv.publisher.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.armandorv.publisher.application.browsers.ArticlesBrowser;
import com.armandorv.publisher.application.helpers.FileHelper;

public class ApplicationFactory {

	private ApplicationContext context = new ClassPathXmlApplicationContext(
			"applicationBeans.xml");
	public static ApplicationFactory FACTORY = new ApplicationFactory();

	private ApplicationFactory() {
		/* to be singelton */
	}

	public FileHelper getFileHelper() {
		return context.getBean("fileHelper", FileHelper.class);
	}

	public ArticlesBrowser getArticlesBrowser() {
		return context.getBean("articlesBrowser", ArticlesBrowser.class);
	}

}
