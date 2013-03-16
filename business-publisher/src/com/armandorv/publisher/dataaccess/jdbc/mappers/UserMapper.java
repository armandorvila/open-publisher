package com.armandorv.publisher.dataaccess.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.armandorv.publisher.model.Author;
import com.armandorv.publisher.model.User;

public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowCount) throws SQLException {
		User user = new User();

		user.setUserName(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setAuthor(this.getAuthor(rs));
		return user;
	}

	private Author getAuthor(ResultSet rs) throws SQLException {
		Author author = new Author();
		author.setId(rs.getLong("author_id"));
		author.setName(rs.getString("name"));
		author.setSurname(rs.getString("surname"));
		author.setDateOfJoining(rs.getDate("dateofjoining"));

		return author;
	}

}
