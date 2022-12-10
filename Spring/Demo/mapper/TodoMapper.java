package com.example.demo.com.example.demo.mapper;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.com.example.demo.dto.TodoDto;
import com.example.demo.com.example.demo.entity.Todo;
import com.example.demo.com.example.demo.entity.User;

@Service
public class TodoMapper {

//	@Autowired
//	UserService userService;

		public TodoDto toDto(Todo entity) {
			if(entity == null) {
				return null;
			}
		
			TodoDto dto = new TodoDto();
			dto.setId(entity.getId());
			dto.setType(entity.getType());
			dto.setContent(entity.getContent());
			dto.setDate(entity.getDate());
			dto.setUserId(entity.getUser().getId());			
//			dto.setUsers(userService.findTodosByUserId(entity.getId()));
//			dto.setUserId(entity.getUserId());
			
			return dto;
		
	}

		public Todo fromDto(TodoDto dto) {
			
			if(dto == null) {
				return null;
			}
			
			Todo entity = new Todo();
			entity.setId(dto.getId());
			entity.setType(dto.getType());
			entity.setContent(dto.getContent());
			entity.setDate(dto.getDate());
			
			User user = new User();
			user.setId(dto.getUserId());
			entity.setUser(user);
			
//			entity.setUserId(dto.getUserId());
			
			return entity;
			
		}
		
		public List<TodoDto> toDtoList(List<Todo> entities){
			
			List<TodoDto> dtos = new ArrayList<>();
			
			for(Todo entity : entities) {
				dtos.add(toDto(entity));
			}
			
			return dtos;
				
		}
	
}
