package com.example.demo.com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.com.example.demo.dto.TodoDto;
import com.example.demo.com.example.demo.dto.UserDto;
import com.example.demo.com.example.demo.entity.Todo;
import com.example.demo.com.example.demo.mapper.TodoMapper;
import com.example.demo.com.example.demo.repository.TodoRepo;

@Service
public class TodoService {

	@Autowired
	TodoRepo todoRepo;
	
	@Autowired
	TodoMapper todoMapper;
	
	public TodoDto findById(Long id) {
		
		Todo todo = todoRepo.findById(id).orElse(null);
		
		TodoDto todoDto = todoMapper.toDto(todo);
		
		return todoDto;
		
	}
	
	public List<TodoDto> findAllTodos() {
		
		List<Todo> todos = (ArrayList<Todo>) todoRepo.findAll();
		
		return todoMapper.toDtoList(todos);
		
	}
	
	public TodoDto createTodo(TodoDto todoDto) {
		
		Todo todo = todoMapper.fromDto(todoDto);
		
		todoRepo.save(todo);
		
		return todoMapper.toDto(todo);
		
	}
	
	public TodoDto updateTodo(TodoDto todoDto) {
		
		Todo todo = todoMapper.fromDto(todoDto);
		
		todoRepo.save(todo);
		
		return todoMapper.toDto(todo);
		
	}
	
	public void deleteTodo(Long id) {
		
	     // todoRepo.findAllByUser_Id(userId);
		
		todoRepo.deleteById(id);
		
	}
	
        public List<TodoDto> findTodosByUserId(Long userId) {  	
    	
	    List<Todo> todos = todoRepo.findAllByUser_Id(userId);
	    	
	    return todoMapper.toDtoList(todos);
	    	
	 }
	
}
