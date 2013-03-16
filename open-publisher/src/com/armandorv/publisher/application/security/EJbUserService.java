package com.armandorv.publisher.application.security;

import org.apache.log4j.Logger;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.armandorv.publisher.business.SecurityService;
import com.armandorv.publisher.model.User;

public class EJbUserService implements UserDetailsService {

	private static Logger log = Logger.getLogger(EJbUserService.class);

	private SecurityService securityService;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		User user = securityService.getUserByUsername(username);
		UserDetails details = new UserDetailsAdaptor(user);

		log.debug("User logued");

		return details;
	}

	public void setSecurityService(SecurityService securityService) {
		this.securityService = securityService;
	}

}
