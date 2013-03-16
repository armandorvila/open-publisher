package com.armandorv.publisher.client.view.models;

import java.util.List;

import javax.swing.AbstractListModel;

import com.armandorv.publisher.client.application.EJBFactory;
import com.armandorv.publisher.model.Author;

public class AuthorsListModel extends AbstractListModel {

	private static final long serialVersionUID = -3203468670874018202L;
	private List<Author> authors;

	public AuthorsListModel() {
		this.authors = EJBFactory.FACTORY.getAuthorsService().getAllAuthors();
	}

	@Override
	public int getSize() {
		return authors.size();
	}

	public Author getCurrentAuthor(int index) {
		return this.authors.get(index);
	}

	@Override
	public Object getElementAt(int index) {

		return authors.get(index).getName();
	}

}
