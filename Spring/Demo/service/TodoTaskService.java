package com.example.demo.com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TodoTaskService {
	
	public String convertTitleToAllCaps(String title) {
		return title.toUpperCase();
	}
	
	public Integer printAssignees(List<String>assigneeNames) {

		System.out.println("Here are the assignee names: ");

		for(int i = 0; i <= assigneeNames.size()-1; i++) {

			System.out.println(assigneeNames.get(i));

		}

		return assigneeNames.size();	

	}

}
