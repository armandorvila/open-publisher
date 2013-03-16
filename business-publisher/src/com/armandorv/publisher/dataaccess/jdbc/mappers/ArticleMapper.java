package com.armandorv.publisher.dataaccess.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.armandorv.publisher.model.Article;

public class ArticleMapper implements RowMapper<Article> {

	@Override
	public Article mapRow(ResultSet rs, int rowsNumber) throws SQLException {
		Article article = new Article();
		article.setId(rs.getLong("id"));
		article.setAuthor(rs.getString("author"));
		article.setDateOfCreation(rs.getDate("DATEOFCREATION"));
		article.setDescription(rs.getString("description"));
		article.setFileName(rs.getString("filename"));
		article.setSubject(rs.getString("subject"));
		article.setTitle(rs.getString("title"));
		article.setUrl(rs.getString("fileurl"));

		return article;
	}

}
