package com.armandorv.publisher.dataaccess;

public interface DaoFatory {

	ArticleDao getArticleDao();

	AuthorDao getAuthorDao();

	UserDao getUserDao();
}
