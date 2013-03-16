package com.armandorv.publisher.business;

import com.armandorv.publisher.model.User;

/**
 * This interface offer service related with users credentails to my own
 * implementation of Authentication Provider of Spring Security.
 * 
 * @author armandorv
 * 
 */
public interface SecurityService {

	public User getUserByUsername(String username);

}
