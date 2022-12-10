package com.example.demo.com.example.demo.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.com.example.demo.dto.CoursesDto;
import com.example.demo.com.example.demo.service.CoursesService;

@RestController
@RequestMapping("/courses")
public class CoursesController {

	@Autowired
	CoursesService coursesService;
	
	@GetMapping("/{id}")
	public CoursesDto findById(@PathVariable(name="id") Long id) {
		
		return coursesService.findById(id);
		
	}
	
	@GetMapping("")
	public List<CoursesDto> findAllCourses() {
		
		return coursesService.findAllCourses();
		
	}
	
	@PostMapping("")
	public CoursesDto createCourse(@Valid @RequestBody CoursesDto coursesDto) {
		
		return coursesService.createCourse(coursesDto);
		
	}
	
	@PutMapping("/{id}")
	public CoursesDto updateCourse(@Valid @RequestBody CoursesDto coursesDto, @PathVariable(name = "id") Long id) {
		
		return coursesService.updateCourse(coursesDto);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteCourse(@PathVariable(name = "id") Long id) {
		
		coursesService.deleteCourse(id);
		
	}
	
	
}
