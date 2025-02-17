package com.harshvardhan.blog.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.harshvardhan.blog.entities.User;
import com.harshvardhan.blog.payloads.UserDto;
import com.harshvardhan.blog.repositeries.UserRepo;
import com.harshvardhan.blog.services.UserService;

public class UserServiceimpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDto createUser(UserDto userdto) {
		// TODO Auto-generated method stub
		User user = this.dtoToUser(userdto);
		User savedUser= this.userRepo.save(user);
		return this.userToDto(savedUser); 
	}

	@Override
	public UserDto updateUser(UserDto user, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}
	
	public User dtoToUser(UserDto userdto) {
		User user=new User();
		user.setId(userdto.getId());
		user.setEmail(userdto.getEmail());
		user.setPassword(userdto.getPassword());
		user.setAbout(userdto.getAbout());
		user.setName(userdto.getName());
		return user;
	
	}
	public UserDto userToDto(User user) {
		UserDto userdto=new UserDto();
		userdto.setId(user.getId());
		userdto.setEmail(user.getEmail());
		userdto.setPassword(user.getPassword());
		userdto.setAbout(user.getAbout());
		userdto.setName(user.getName());
		return userdto;
	
	}
	

}
