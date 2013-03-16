package com.armandorv.publisher.client.view.builders.articles;

import javax.swing.JTextField;

public class ArticlesJTBuilder {

	public static JTextField getTitleJTextField() {
		JTextField textField_title = new JTextField();
		textField_title.setEditable(false);
		textField_title.setBounds(426, 81, 86, 20);
		textField_title.setColumns(10);
		return textField_title;
	}

	public static JTextField getSubjectJTextField() {
		JTextField textField_subject = new JTextField();
		textField_subject.setEditable(false);
		textField_subject.setBounds(426, 119, 86, 20);
		textField_subject.setColumns(10);
		return textField_subject;
	}

	public static JTextField getDescriptionJTextField() {
		JTextField textField_desc = new JTextField();
		textField_desc.setEditable(false);
		textField_desc.setBounds(426, 157, 86, 20);
		textField_desc.setColumns(10);
		return textField_desc;
	}
	public static JTextField getAuthorJTextField() {
		JTextField textField_author = new JTextField();
		textField_author.setEditable(false);
		textField_author.setBounds(426, 198, 86, 20);
		textField_author.setColumns(10);
		return textField_author;
	}
}
