package com.armandorv.publisher.business.authors;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.armandorv.publisher.model.Author;
import com.armandorv.publisher.model.User;

@Stateless
@WebService(name = "AuthorsService")
public class EjbAuthorsService implements AuthorsServiceLocal,
		AuthorsServiceRemote {

	private AuthorsManager manager;
	private AuthorsProvider provider;

	public EjbAuthorsService() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"businessBeans.xml");
		this.manager = context.getBean(AuthorsManager.class);
		this.provider = context.getBean(AuthorsProvider.class);
	}

	@Override
	public void enrollAuthor(User user, Author author) {
		manager.enrollAuthor(user, author);

	}

	@Override
	public void deleteAuthor(long id) {
		manager.deleteAuthor(id);

	}

	@Override
	public void modifyAuthor(Author author) {
		manager.modifyAuthor(author);

	}

	@Override
	public Author getAuthorByuserName(String username) {

		return provider.getAuthorByuserName(username);
	}

	@Override
	public List<Author> getAllAuthors() {

		return provider.getAllAuthors();
	}

}
