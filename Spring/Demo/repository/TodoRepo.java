package com.example.demo.com.example.demo.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.com.example.demo.entity.Student;
import com.example.demo.com.example.demo.entity.Todo;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Long> {

	public List<Todo> findAllByUser_Id(Long userId);
	
}
