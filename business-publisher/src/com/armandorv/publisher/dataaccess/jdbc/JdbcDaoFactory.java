package com.armandorv.publisher.dataaccess.jdbc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.armandorv.publisher.dataaccess.ArticleDao;
import com.armandorv.publisher.dataaccess.AuthorDao;
import com.armandorv.publisher.dataaccess.DaoFatory;
import com.armandorv.publisher.dataaccess.UserDao;

public class JdbcDaoFactory implements DaoFatory, ApplicationContextAware {

	private ApplicationContext context;

	// = new ClassPathXmlApplicationContext(
	// "dataAccessBeans.xml");

	@Override
	public ArticleDao getArticleDao() {

		return context.getBean("jdbcArticleDao", ArticleDao.class);
	}

	@Override
	public AuthorDao getAuthorDao() {

		return context.getBean("jdbcAuthorDao", AuthorDao.class);
	}

	@Override
	public UserDao getUserDao() {
		return context.getBean("jdbcUserDao", UserDao.class);
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;

	}

}
