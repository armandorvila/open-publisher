package com.armandorv.publisher.client.view.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;

import com.armandorv.publisher.business.AuthorsService;
import com.armandorv.publisher.client.application.EJBFactory;
import com.armandorv.publisher.client.view.models.AuthorsListModel;
import com.armandorv.publisher.model.Author;

public class DeleteAuthor implements ActionListener {

	private JList authorsList;
	private AuthorsListModel authorsModel;

	public DeleteAuthor(JList authorsList, AuthorsListModel authorsModel) {
		this.authorsList = authorsList;
		this.authorsModel = authorsModel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int[] index = authorsList.getSelectedIndices();
		if (index.length > 0) {
			Author author = authorsModel.getCurrentAuthor(index[0]);
			AuthorsService service = EJBFactory.FACTORY.getAuthorsService();
			service.deleteAuthor(author.getId());
			authorsList.setModel(new AuthorsListModel());

		}
	}

}
