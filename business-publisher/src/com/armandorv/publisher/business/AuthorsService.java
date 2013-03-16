package com.armandorv.publisher.business;

import java.util.List;
import com.armandorv.publisher.model.Author;
import com.armandorv.publisher.model.User;

/**
 * Interface wich define services related with authors.
 * 
 * @author armandorv
 * 
 */
public interface AuthorsService {

	/**
	 * Enroll a new author into the system, for this it is necesary an @Author
	 * object with the author data, and an @User object with the credentials of
	 * the author.
	 * 
	 * @param user
	 * @param author
	 */
	public void enrollAuthor(User user, Author author);

	public void deleteAuthor(long id);

	public void modifyAuthor(Author author);

	public Author getAuthorByuserName(String username);

	public List<Author> getAllAuthors();

}
