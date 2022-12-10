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
import com.example.demo.com.example.demo.dto.TodoDto;
import com.example.demo.com.example.demo.mapper.TodoMapper;
import com.example.demo.com.example.demo.repository.TodoRepo;
import com.example.demo.com.example.demo.service.TodoService;

@CrossOrigin(origins = {"http://localhost:5500","http://127.0.0.1:5500"})
@RestController
@RequestMapping("/todo")
public class TodoController {

	@Autowired
	TodoMapper todoMapper;
	
	@Autowired
	TodoRepo todoRepo;
	
	@Autowired
	TodoService todoService;
	
	@GetMapping("/{id}")
	public TodoDto findById(@PathVariable(name="id") Long id) {
		
		return todoService.findById(id);
		
	}
	
	@GetMapping("user/{user_id}")
	public List<TodoDto> findTodosByUserId(@PathVariable(name="user_id") Long id) {
		
		return todoService.findTodosByUserId(id);
		
	}
	
	@PreAuthorize("hasRole('USER')")
	@GetMapping("")
	public List<TodoDto> findAllTodos() {
		
		return todoService.findAllTodos();
		
	}
	
	@PostMapping("")
	public TodoDto createTodo(@Valid @RequestBody TodoDto todo) {
		
		return todoService.createTodo(todo);
		
	}
	
	@PutMapping("/{id}")
	public TodoDto updateTodo(@Valid @RequestBody TodoDto todo, @PathVariable(name = "id") Long id) {
		
		return todoService.updateTodo(todo);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteTodo(@PathVariable(name = "id") Long id) {
		
		todoService.deleteTodo(id);
		
	}
	
//	@DeleteMapping("/{id}/{user_id}")
//	public void deleteTodo(@PathVariable(name = "id") Long id, @PathVariable(name="user_id") Long userId) {	
//		todoService.deleteTodo(id,userId);	
//	}
	
}
