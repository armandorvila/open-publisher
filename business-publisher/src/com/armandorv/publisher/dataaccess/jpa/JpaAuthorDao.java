package com.armandorv.publisher.dataaccess.jpa;

import java.util.List;

import com.armandorv.publisher.dataaccess.AuthorDao;
import com.armandorv.publisher.model.Author;

//@Stateless @Local
public class JpaAuthorDao implements AuthorDao {

	@Override
	public long createAuthor(Author author) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modifyAuthor(Author author) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAuthor(long authorId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Author getAuthorByID(long authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Author> getAuthors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addArticle(long idAuthor, long idArticle) {
		// TODO Auto-generated method stub
		
	}

}
