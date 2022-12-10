package com.example.demo.com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.com.example.demo.object.TodoTask;
import com.example.demo.com.example.demo.service.TodoTaskService;

@RestController
@RequestMapping("/todotask")
public class TodoTaskController {

	@Autowired
	TodoTaskService todotaskService;
	
//	@PostMapping("/print")
//	public TodoTask printToDoTask(@RequestBody TodoTask task) {
		
//		System.out.println("task title: " + task.getTitle());
//		System.out.println("task content: " + task.getContent());
		
//		return task;		
//	}
	
	@PostMapping("/allcaps")
	public TodoTask convertoUppercase(@RequestBody TodoTask task) {
		
		String upperCase = task.getTitle();
		task.setTitle(todotaskService.convertTitleToAllCaps(upperCase));
		System.out.println("TodoTask title : " + task.getTitle());	
		return task;
		
	}
	
//	@GetMapping("/countassignees")
//	public TodoTask countTaskAssignees(@RequestBody TodoTask task) {
		
//		todotaskService.printAssignees(task.getAssigneeNames());
//		System.out.println("Task has " + task.getCounter() + " assignees");
//		return task;
				
//	}
	
}
