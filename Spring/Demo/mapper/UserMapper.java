package com.example.demo.com.example.demo.mapper;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.com.example.demo.dto.UserDto;
import com.example.demo.com.example.demo.entity.User;
import com.example.demo.com.example.demo.service.TodoService;

@Service
public class UserMapper {

	@Autowired
	TodoService todoService;
	
	public UserDto toDto(User entity) {
		if(entity == null) {
			return null;
		}
	
		UserDto dto = new UserDto();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setLastName(entity.getLastName());
		dto.setEmail(entity.getEmail());
		dto.setDate(entity.getDate());
		
		dto.setTodos(todoService.findTodosByUserId(entity.getId()));
//		dto.setTodoIds(entity.getTodo().stream().map(Todo::getId).collect(Collectors.toList()));
		
		return dto;
	
}

	public User fromDto(UserDto dto) {
		
		if(dto == null) {
			return null;
		}
		
		User entity = new User();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setLastName(dto.getLastName());
		entity.setEmail(dto.getEmail());
		entity.setDate(dto.getDate());
		
//		entity.setTodo(dto.getTodoIds().stream().map(id ->
//		{
			
//			Todo newTodo = new Todo();
//			newTodo.setId(id);
//			return newTodo;
			
//		})
//		.collect(Collectors.toList()));
		
		return entity;
		
	}
	
	public List<UserDto> toDtoList(List<User> entities){
		
		List<UserDto> dtos = new ArrayList<>();
		
		for(User entity : entities) {
			dtos.add(toDto(entity));
		}
		
		return dtos;
					
	}		
	
}
