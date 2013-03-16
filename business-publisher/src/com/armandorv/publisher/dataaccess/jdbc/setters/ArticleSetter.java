package com.armandorv.publisher.dataaccess.jdbc.setters;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

import com.armandorv.publisher.model.Article;

public class ArticleSetter implements PreparedStatementSetter{

	private Article article;

	public ArticleSetter(Article article) {
		this.article = article;
	}

	@Override
	public void setValues(PreparedStatement ps) throws SQLException {

		ps.setString(1, article.getTitle());
		ps.setDate(2, new Date(article.getDateOfCreation().getTime()));
		ps.setString(3, article.getAuthor());
		ps.setString(4, article.getDescription());
		ps.setString(5, article.getSubject());
		ps.setString(6, article.getFileName());
		ps.setString(7, article.getUrl());
	}

}
