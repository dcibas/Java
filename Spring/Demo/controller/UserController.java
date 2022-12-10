package com.example.demo.com.example.demo.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.com.example.demo.dto.UserDto;
import com.example.demo.com.example.demo.entity.User;
import com.example.demo.com.example.demo.mapper.UserMapper;
import com.example.demo.com.example.demo.service.UserService;

@CrossOrigin(origins = {"http://localhost:5500","http://127.0.0.1:5500"})
@RestController
@RequestMapping("/api/user")
public class UserController {

	
	@Autowired
	UserService userService;
	
//	@Autowired
//	private UserMapper userMapper;
	
	@GetMapping("/{id}")
	public UserDto findById(@PathVariable(name="id") Long id) {
		
		return userService.findById(id);
		
//		User entity = service.findOne(id);
		
//		return userMapper.toDto(entity);
		
	}
	
	@PreAuthorize("hasRole('USER')")
	@GetMapping("")
	public List<UserDto> findAllUsers() {
		
		return userService.findAllUsers();
		
	}
	
	@PostMapping("")
	public UserDto createUser(@Valid @RequestBody UserDto userDto) {
		
		return userService.createUser(userDto);
		
//		User entity = userMapper.fromDto(userDto);
//		entity = userService.beforeSave(entity);
//		User savedEntity = userService.save(entity);
		
	}
	
	@PutMapping("/{id}")
	public UserDto updateUser(@Valid @RequestBody UserDto userDto, @PathVariable(name = "id") Long id) {
		
		return userService.updateUser(userDto);
		
//		User entity = userMapper.fromDto(dto);
		
//		User existing = userService.findOne(entity.getId());
//		if(existing == null) {
//			throw new IllegalArgumentException("User entity not found");
//		}
	
//		entity = userService.beforeSave(entity);
//		User updatedEntity = userService.save(entity);
		
//		return userMapper.toDto(updatedEntity);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable(name = "id") Long id) {
		
		userService.deleteUser(id);
		
	}
	
}
