package com.armandorv.publisher.dataaccess.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.armandorv.publisher.dataaccess.UserDao;
import com.armandorv.publisher.dataaccess.exception.PersistenceException;
import com.armandorv.publisher.dataaccess.jdbc.mappers.UserMapper;
import com.armandorv.publisher.dataaccess.jdbc.setters.UserSetter;
import com.armandorv.publisher.dataaccess.jdbc.sql.UserSQLWrapping;
import com.armandorv.publisher.model.User;

public class JdbcUserDao extends JdbcDaoSupport implements UserDao {

	private static Logger log = Logger.getLogger(JdbcUserDao.class);
	private UserSQLWrapping sqlWrapping;

	public JdbcUserDao(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	public void createUser(User user) {
		super.getJdbcTemplate().update(sqlWrapping.getCreate(),
				new UserSetter(user));

	}

	@Override
	public void modifyUser(User user) {
		super.getJdbcTemplate().update(sqlWrapping.getCreate(),
				new UserSetter(user));

	}

	@Override
	public void delteUser(long authorId) {
		super.getJdbcTemplate().update(sqlWrapping.getDelete(), authorId);

	}

	@Override
	public User getUserByUserName(String username) {

		List<User> users = super.getJdbcTemplate().query(
				sqlWrapping.getGetByUserName(), new String[] { username },
				new UserMapper());
		if (users.size() > 1) {
			log.error("Duplicated username or null username:" + username);
			throw new PersistenceException(
					"Duplicated username or null username:" + username);
		}
		if(users.size()==0)
			return null;
		return users.get(0);
	}

	public void setSqlWrapping(UserSQLWrapping sqlWrapping) {
		this.sqlWrapping = sqlWrapping;
	}

}
