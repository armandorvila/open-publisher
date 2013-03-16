package com.armandorv.publisher.client.view.builders.articles;

import java.awt.Font;

import javax.swing.JLabel;

/**
 * Builder of JLabel objects for articles view.
 * 
 * @author armandorv
 * 
 */
public class ArticlesJLBuilder {

	public static JLabel getArticlesManagementJLabel() {
		JLabel lblArticlesManagement = new JLabel("Articles Management");
		lblArticlesManagement.setFont(new Font("Serif", Font.BOLD, 24));
		lblArticlesManagement.setBounds(10, 11, 235, 34);
		return lblArticlesManagement;
	}

	public static JLabel getTitleJlabel() {
		JLabel lblTitle = new JLabel("Name:");
		lblTitle.setFont(new Font("Serif", Font.BOLD, 14));
		lblTitle.setBounds(267, 87, 46, 14);
		return lblTitle;
	}

	public static JLabel getADescriptionJlabel() {
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Serif", Font.BOLD, 14));
		lblDescription.setBounds(267, 158, 77, 14);
		return lblDescription;
	}

	public static JLabel getSubjectJlabel() {
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setFont(new Font("Serif", Font.BOLD, 14));
		lblSubject.setBounds(267, 120, 62, 14);
		return lblSubject;
	}

	public static JLabel getAuthorJLabel() {
		JLabel lblAuthor = new JLabel("Author:");
		lblAuthor.setFont(new Font("Serif", Font.BOLD, 14));
		lblAuthor.setBounds(267, 199, 77, 14);
		return lblAuthor;
	}

}
