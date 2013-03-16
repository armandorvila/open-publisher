package com.armandorv.publisher.dataaccess.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.armandorv.publisher.dataaccess.ArticleDao;
import com.armandorv.publisher.dataaccess.exception.PersistenceException;
import com.armandorv.publisher.dataaccess.jdbc.mappers.ArticleMapper;
import com.armandorv.publisher.dataaccess.jdbc.setters.ArticleSetter;
import com.armandorv.publisher.dataaccess.jdbc.sql.ArticleSQLWrapping;
import com.armandorv.publisher.model.Article;

public class JdbcArticleDao extends JdbcDaoSupport implements ArticleDao {

	private static Logger log = Logger.getLogger(JdbcArticleDao.class);
	private ArticleSQLWrapping sqlWrapping;

	public JdbcArticleDao(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	public long createArticle(Article article) {
		super.getJdbcTemplate().update(sqlWrapping.getCreate(),
				new ArticleSetter(article));
		long id = super.getJdbcTemplate().queryForLong(
				sqlWrapping.getGetLastId());
		return id;
	}

	@Override
	public void modifyArticle(Article article) {
		super.getJdbcTemplate().update(sqlWrapping.getModify(),
				article.getTitle(), article.getDateOfCreation(),
				article.getAuthor(), article.getDescription(),
				article.getSubject(), article.getFileName(), article.getUrl(),
				article.getId());

	}

	@Override
	public void deleteArticle(long id) {
		super.getJdbcTemplate().update(sqlWrapping.getDelete(), id);

	}

	@Override
	public Article getById(long id) {
		List<Article> articles = super.getJdbcTemplate().query(
				sqlWrapping.getGetById(), new ArticleMapper(), id);

		if (articles.size() > 1) {
			log.error("Duplicated Id or null id:" + id);
			throw new PersistenceException("Duplicated Id or null id:" + id);
		}
		if (articles.size() == 0)
			return null;
		return articles.get(0);
	}

	@Override
	public List<Article> getArticles() {
		List<Article> articles = super.getJdbcTemplate().query(
				sqlWrapping.getGetAll(), new ArticleMapper());
		log.info("Retrived :" + articles.size() + "Articles.");
		return articles;
	}

	@Override
	public List<Article> getArticlesByAuthor(long id) {
		List<Article> articles = super.getJdbcTemplate().query(
				sqlWrapping.getGetByAuthor(), new ArticleMapper(), id);
		log.info("Retrived :" + articles.size() + "Articles.");
		return articles;
	}

	public void setSqlWrapping(ArticleSQLWrapping sqlWrapping) {
		this.sqlWrapping = sqlWrapping;
	}

}
