package com.armandorv.publisher.dataaccess.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.armandorv.publisher.model.Author;

public class AuthorMapper implements RowMapper<Author> {

	@Override
	public Author mapRow(ResultSet rs, int rowCounts) throws SQLException {
		Author author = new Author();
		author.setId(rs.getLong("id"));
		author.setName(rs.getString("name"));
		author.setSurname(rs.getString("surname"));
		author.setDateOfJoining(rs.getDate("dateofjoining"));
		
		return author;
	}
}
