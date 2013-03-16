package com.armandorv.publisher.dataaccess.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.armandorv.publisher.dataaccess.AuthorDao;
import com.armandorv.publisher.dataaccess.exception.PersistenceException;
import com.armandorv.publisher.dataaccess.jdbc.mappers.AuthorMapper;
import com.armandorv.publisher.dataaccess.jdbc.setters.AuthorSetter;
import com.armandorv.publisher.dataaccess.jdbc.sql.AuthorSQLWrapping;
import com.armandorv.publisher.model.Author;

public class JdbcAuthorDao extends JdbcDaoSupport implements AuthorDao {

	private static Logger log = Logger.getLogger(JdbcAuthorDao.class);
	private AuthorSQLWrapping sqlWrapping;

	public JdbcAuthorDao(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	public long createAuthor(Author author) {
		super.getJdbcTemplate().update(sqlWrapping.getCreate(),
				new AuthorSetter(author));
		long id = super.getJdbcTemplate().queryForLong(
				sqlWrapping.getGetLastId());
		return id;
	}

	@Override
	public void modifyAuthor(Author author) {
		super.getJdbcTemplate().update(sqlWrapping.getModify(),
				author.getName(), author.getSurname(),
				author.getDateOfJoining(), author.getId());

	}

	@Override
	public void deleteAuthor(long id) {
		super.getJdbcTemplate().update(sqlWrapping.getDelete(), id);

	}

	@Override
	public Author getAuthorByID(long id) {
		List<Author> authors = super.getJdbcTemplate().query(
				sqlWrapping.getGetById(), new AuthorMapper(), id);

		if (authors.size() > 1) {
			log.error("Duplicated Id or null id:" + id);
			throw new PersistenceException("Duplicated Id or null id:" + id);
		}
		if (authors.size() == 0)
			return null;
		return authors.get(0);
	}

	@Override
	public List<Author> getAuthors() {

		return super.getJdbcTemplate().query(sqlWrapping.getGetAll(),
				new AuthorMapper());
	}

	@Override
	public void addArticle(long idAuthor, long idArticle) {
		super.getJdbcTemplate().update(sqlWrapping.getAddArticle(), idAuthor,
				idArticle);

	}

	public void setSqlWrapping(AuthorSQLWrapping sqlWrapping) {
		this.sqlWrapping = sqlWrapping;
	}

}
