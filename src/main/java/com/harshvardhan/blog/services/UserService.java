package com.harshvardhan.blog.services;

import java.util.List;

import com.harshvardhan.blog.payloads.UserDto;

public interface UserService {
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
	

}
