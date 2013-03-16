/**
 * 
 */
package com.armandorv.publisher.business.security;

import javax.ejb.Stateless;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.armandorv.publisher.model.User;

@Stateless
@WebService(name="SecurityService")
public class EjbSecurityService implements SecurityServiceRemote,
		SecurityServiceLocal {

	private UsersManager manager;

	public EjbSecurityService() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"businessBeans.xml");
		this.manager = context.getBean(UsersManager.class);
	}

	@Override
	public User getUserByUsername(String username) {

		return manager.getUser(username);
	}

}
