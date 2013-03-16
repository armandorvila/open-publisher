package com.armandorv.publisher.client.view.builders.authors;

import java.awt.Font;

import javax.swing.JLabel;

/**
 * Builder of JLabel objects for statics view.
 * 
 * @author armandorv
 * 
 */
public class AuthorsJLBuilder {

	public static JLabel getAuthorsManagementJLabel() {
		JLabel lblAuthorsManagement = new JLabel("Authors Management");
		lblAuthorsManagement.setFont(new Font("Serif", Font.BOLD, 24));
		lblAuthorsManagement.setBounds(10, 11, 242, 46);
		return lblAuthorsManagement;
	}

	public static JLabel getNameJLabel() {
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Serif", Font.BOLD, 14));
		lblName.setBounds(247, 88, 46, 14);
		return lblName;
	}

	public static JLabel getSurnameJLabel() {
		JLabel lblSurname = new JLabel("Surname:\r\n");
		lblSurname.setFont(new Font("Serif", Font.BOLD, 14));
		lblSurname.setBounds(247, 130, 66, 14);
		return lblSurname;
	}

	public static JLabel getUsernameJLabel() {
		JLabel lblUsername = new JLabel("Date of Joining:\r\n");
		lblUsername.setFont(new Font("Serif", Font.BOLD, 14));
		lblUsername.setBounds(247, 169, 99, 14);
		return lblUsername;
	}


}
