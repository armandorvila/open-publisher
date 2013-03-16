package com.armandorv.publisher.dataaccess.jdbc.setters;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

import com.armandorv.publisher.model.User;

public class UserSetter implements PreparedStatementSetter {

	private User user;

	public UserSetter(User user) {
		this.user = user;
	}

	@Override
	public void setValues(PreparedStatement ps) throws SQLException {
		
		ps.setString(1, user.getUserName());
		ps.setString(2, user.getPassword());
		ps.setLong(3, user.getAuthor().getId());

	}

}
