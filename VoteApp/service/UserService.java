package com.codeacademy.voteapp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codeacademy.voteapp.dto.UserDto;
import com.codeacademy.voteapp.entity.User;
import com.codeacademy.voteapp.mapper.UserMapper;
import com.codeacademy.voteapp.repository.UserRepo;


@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	UserMapper userMapper;
	
	
	public UserDto findById(Long id) {
		
		User user = userRepo.findById(id).orElse(null);
		
		UserDto userDto = userMapper.toDto(user);
		
		return userDto;
		
	}
	
	public List<UserDto> findAllUsers() {
		
		List<User> users = (ArrayList<User>) userRepo.findAll();
		
		return userMapper.toDtoList(users);
		
	}
	
	public UserDto createUser(UserDto userDto) {
		
		User user = userMapper.fromDto(userDto);
		
		userRepo.save(user);
		
		return userMapper.toDto(user);
		
	}
	
	public UserDto updateUser(UserDto userDto) {
		
		User user = userMapper.fromDto(userDto);
		
		userRepo.save(user);
		
		return userMapper.toDto(user);
		
	}
	
	public void deleteUser(Long id) {
		
		userRepo.deleteById(id);
		
	}
	
}
