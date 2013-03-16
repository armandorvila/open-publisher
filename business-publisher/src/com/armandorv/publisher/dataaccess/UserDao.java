package com.armandorv.publisher.dataaccess;

import com.armandorv.publisher.model.User;

public interface UserDao {

	public void createUser(User user);

	public void modifyUser(User user);

	public void delteUser(long authorId);

	public User getUserByUserName(String username);

}
