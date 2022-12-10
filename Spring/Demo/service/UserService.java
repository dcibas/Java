package com.example.demo.com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.com.example.demo.dto.StudentDto;
import com.example.demo.com.example.demo.dto.UserDto;
import com.example.demo.com.example.demo.entity.Student;
import com.example.demo.com.example.demo.entity.Todo;
import com.example.demo.com.example.demo.entity.User;
import com.example.demo.com.example.demo.mapper.UserMapper;
import com.example.demo.com.example.demo.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	UserMapper userMapper;
	
//	@Autowired 
//	TodoService todoService;
	
//	public User findOne(Long id) {
//		return userRepo.findById(id).orElse(null);
//	}
	
//	public User beforeSave(User entity) {
//		List<Todo> todo = entity.getTodo().stream()
//				.map(Todo::getId)
//				.map(id -> TodoService.findOne(id))
//				.filter(Objects::nonNull)
//				.collect(Collectors.toList());
//		entity.setTodo(todo);
	
//		return entity;
//	}
	
//	public User save(User entity) {
//		return userRepo.save(entity);
//	}
	
	public UserDto findById(Long id){
		
		User user = userRepo.findById(id).orElse(null);
		
		UserDto userDto = userMapper.toDto(user);
		
		return userDto;
		
	}
	
	public List<UserDto> findAllUsers(){
		
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
