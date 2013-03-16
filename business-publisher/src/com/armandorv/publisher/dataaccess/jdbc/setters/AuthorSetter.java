package com.armandorv.publisher.dataaccess.jdbc.setters;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

import com.armandorv.publisher.model.Author;

public class AuthorSetter implements PreparedStatementSetter {

	private Author author;

	public AuthorSetter(Author author) {
		this.author = author;
	}

	@Override
	public void setValues(PreparedStatement ps) throws SQLException {
		ps.setString(1, author.getName());
		ps.setString(2, author.getSurname());
		ps.setDate(3, new Date(author.getDateOfJoining().getTime()));

	}

}
