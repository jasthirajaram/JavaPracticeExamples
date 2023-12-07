package com.example.service;

import java.util.List;

import com.example.dto.UserDto;
import com.example.entity.User;

public interface UserService {
	
	public UserDto createUser(UserDto user);
	
	public UserDto getUserById(Long userId);
	
	public UserDto getUserByUsername(String userName);
	
	public List<UserDto> getAllUsers();
	
    public UserDto updateUser(UserDto user);
	
	public void deleteUser(Long userId);
	
//	public User validateUser(String userName, String password);
}