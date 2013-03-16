package com.armandorv.publisher.application.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import com.armandorv.publisher.model.User;

public class UserDetailsAdaptor implements UserDetails {

	private static final long serialVersionUID = -4388701527691863214L;
	private User user;

	public UserDetailsAdaptor(User user) {
		this.user = user;
	}

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		return AuthorityUtils.createAuthorityList("ROLE_AUTHOR");
	}

	@Override
	public String getPassword() {

		return user.getPassword();
	}

	@Override
	public String getUsername() {

		return user.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {

		return user != null;
	}

	@Override
	public boolean isAccountNonLocked() {

		return user != null;
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return user != null;
	}

	@Override
	public boolean isEnabled() {

		return user != null;
	}

}
