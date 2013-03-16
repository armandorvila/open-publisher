package com.armandorv.publisher.dataaccess;

import java.util.List;

import com.armandorv.publisher.model.Author;

public interface AuthorDao {

	public long createAuthor(Author author);

	public void modifyAuthor(Author author);

	public void deleteAuthor(long id);

	public Author getAuthorByID(long id);

	public List<Author> getAuthors();
	
	public void addArticle(long idAuthor,long idArticle);
}
