package com.example.demo.com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.com.example.demo.dto.CoursesDto;
import com.example.demo.com.example.demo.entity.Courses;
import com.example.demo.com.example.demo.mapper.CoursesMapper;
import com.example.demo.com.example.demo.repository.CoursesRepo;

@Service
public class CoursesService {

	@Autowired
	CoursesRepo coursesRepo;
	
	@Autowired
	CoursesMapper coursesMapper;
	
	public CoursesDto findById(Long id) {
		
		Courses courses = coursesRepo.findById(id).orElse(null);
		
		CoursesDto coursesDto = coursesMapper.toDto(courses);
		
		return coursesDto;
		
	}
	
	public List<CoursesDto> findAllCourses(){
		
		List<Courses> courses = (ArrayList<Courses>) coursesRepo.findAll();
		
		return coursesMapper.toDto(courses);
		
	}
	
	public CoursesDto createCourse(CoursesDto coursesDto) {
		
		Courses courses = coursesMapper.fromDto(coursesDto);
		
		Courses savedCourse = coursesRepo.save(courses);
			
		return coursesMapper.toDto(savedCourse);
		
	}
	
	public CoursesDto updateCourse(CoursesDto coursesDto) {
		
		Courses courses = coursesMapper.fromDto(coursesDto);
		
		Courses updatedCourse = coursesRepo.save(courses);
		
		return coursesMapper.toDto(updatedCourse);
		
//		return null;
		
	}
	
	public void deleteCourse(Long id) {
		
		coursesRepo.deleteById(id);
		
	}
	
}
