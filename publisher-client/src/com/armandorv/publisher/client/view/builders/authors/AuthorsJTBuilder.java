package com.armandorv.publisher.client.view.builders.authors;

import javax.swing.JTextField;

public class AuthorsJTBuilder {

	public static JTextField getNameJTextField() {
		JTextField textField_Name = new JTextField();
		textField_Name.setEditable(false);
		textField_Name.setBounds(413, 85, 86, 20);
		textField_Name.setColumns(10);
		return textField_Name;
	}

	public static JTextField getSurnameJTextField() {
		JTextField textField_SurName = new JTextField();
		textField_SurName.setEditable(false);
		textField_SurName.setBounds(413, 127, 86, 20);
		textField_SurName.setColumns(10);
		return textField_SurName;
	}

	public static JTextField getDateOfJoiningJTextField() {
		JTextField textField_DateOfJoining = new JTextField();
		textField_DateOfJoining.setEditable(false);
		textField_DateOfJoining.setBounds(413, 166, 86, 20);
		textField_DateOfJoining.setColumns(10);
		return textField_DateOfJoining;
	}
}
