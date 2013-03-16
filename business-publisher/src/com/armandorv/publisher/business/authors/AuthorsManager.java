package com.armandorv.publisher.business.authors;

import com.armandorv.publisher.dataaccess.AuthorDao;
import com.armandorv.publisher.dataaccess.UserDao;
import com.armandorv.publisher.model.Author;
import com.armandorv.publisher.model.User;

public class AuthorsManager {

	private AuthorDao authorDao;
	private UserDao userDao;

	public void enrollAuthor(User user, Author author) {

		author.setId(authorDao.createAuthor(author));
		user.setAuthor(author);
		userDao.createUser(user);

	}

	public void deleteAuthor(long id) {
		userDao.delteUser(id);
		authorDao.deleteAuthor(id);

	}

	public void modifyAuthor(Author author) {
		authorDao.modifyAuthor(author);

	}

	public void setAuthorDao(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
