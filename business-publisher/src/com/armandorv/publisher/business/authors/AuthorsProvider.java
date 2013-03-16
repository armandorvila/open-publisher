package com.armandorv.publisher.business.authors;

import java.util.List;

import com.armandorv.publisher.dataaccess.AuthorDao;
import com.armandorv.publisher.dataaccess.UserDao;
import com.armandorv.publisher.model.Author;
import com.armandorv.publisher.model.User;

public class AuthorsProvider {

	private AuthorDao authorDao;
	private UserDao userDao;

	public List<Author> getAllAuthors() {

		return authorDao.getAuthors();
	}

	public Author getAuthorByuserName(String username) {
		User user = userDao.getUserByUserName(username);
		/* if user==null the username dosent exist. */
		if (user == null)
			return null;
		return user.getAuthor();
	}

	public void setAuthorDao(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
