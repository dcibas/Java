package com.example.demo.com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.com.example.demo.entity.Courses;

@Repository
public interface CoursesRepo extends CrudRepository<Courses,Long> {
	

}
