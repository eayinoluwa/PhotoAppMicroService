package com.appdeveloperblog.photoapp.api.users.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.appdeveloperblog.photoapp.api.users.shared.UserDto;

public interface UsersService extends UserDetailsService {
	UserDto createuser(UserDto userDetails);
	UserDto getUserDetailsByEmail(String email);
	UserDto getUserByUserId(String userId);
}
