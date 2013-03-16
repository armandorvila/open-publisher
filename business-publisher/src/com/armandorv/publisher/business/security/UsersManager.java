package com.armandorv.publisher.business.security;

import com.armandorv.publisher.dataaccess.UserDao;
import com.armandorv.publisher.model.User;

public class UsersManager {

	private UserDao dao;
	
	public User getUser(String username) {
		
		return dao.getUserByUserName(username);
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

}
