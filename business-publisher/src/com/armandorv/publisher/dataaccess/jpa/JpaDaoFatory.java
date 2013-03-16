package com.armandorv.publisher.dataaccess.jpa;

import com.armandorv.publisher.dataaccess.ArticleDao;
import com.armandorv.publisher.dataaccess.AuthorDao;
import com.armandorv.publisher.dataaccess.DaoFatory;
import com.armandorv.publisher.dataaccess.UserDao;

public class JpaDaoFatory implements DaoFatory {

	@Override
	public ArticleDao getArticleDao() {
		return new JpaArticleDao();
		// return (ArticleDao) this.jndiFind("ArticleDao/local");
	}

	@Override
	public AuthorDao getAuthorDao() {
		return new JpaAuthorDao();
		// return (AuthorDao) this.jndiFind("UserDao/AuthorDao/local");
	}

	@Override
	public UserDao getUserDao() {
		return new JpaUserDao();
		// return (UserDao) this.jndiFind("UserDao/local");
	}

	//
	// private Object jndiFind(String node) {
	// Context ctx;
	// try {
	// ctx = new InitialContext();
	// return ctx.lookup(node);
	// } catch (NamingException e) {
	// log.error("Error getting jpaDao:" + e.getMessage());
	// throw new RuntimeException(e);
	// }
	// }

}
