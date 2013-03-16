package com.armandorv.publisher.client.view.listeners;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import javax.swing.JList;
import javax.swing.JTextField;

import com.armandorv.publisher.client.view.models.AuthorsListModel;
import com.armandorv.publisher.model.Author;

public class AuthorClickListener extends MouseAdapter {

	private AuthorsListModel model;
	private JList articlesList;
	private JTextField name;
	private JTextField surname;
	private JTextField date;

	public AuthorClickListener(AuthorsListModel model, JList articlesList,
			JTextField name, JTextField surname, JTextField date) {
		this.model = model;
		this.articlesList = articlesList;
		this.name = name;
		this.surname = surname;
		this.date = date;

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int index = this.articlesList.locationToIndex(e.getPoint());
		if (index >= 0) {
			Author author = model.getCurrentAuthor(index);
			SimpleDateFormat sf = new SimpleDateFormat("dd-MM-aaaa");
			name.setText(author.getName());
			surname.setText(author.getSurname());
			date.setText(sf.format(author.getDateOfJoining()));
		}
	}

}
