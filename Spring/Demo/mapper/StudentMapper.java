package com.example.demo.com.example.demo.mapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.com.example.demo.dto.CoursesDto;
import com.example.demo.com.example.demo.dto.StudentDto;
import com.example.demo.com.example.demo.entity.Courses;
import com.example.demo.com.example.demo.entity.Student;
import com.example.demo.com.example.demo.entity.University;

@Service
public class StudentMapper {

	/*@Autowired
	CoursesService coursesService;*/
	
	public StudentDto toDto(Student entity) {
		if(entity == null) {
			return null;
		}
	
		StudentDto dto = new StudentDto();
		dto.setId(entity.getId());
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setPersonalCode(entity.getPersonalCode());
//		dto.setUniversityId(entity.getUniversity().getId());
		dto.setCoursesId(toCourseIds(entity.getEnrolledCourses()));	
		
//		List<Long> coursesId = new ArrayList<>();
		
//		for(Courses s : entity.getEnrolledCourses()) {
//			coursesId.add(s.getId());
//		}
		
//		dto.setCoursesId(coursesId);
		
//		List<CoursesDto> courses = new ArrayList<>();
//		List<Courses> coursesfromDb = coursesService.findCoursesByStudentId(entity.getId());
//		for(Courses c : coursesfromDb) {
//			CoursesDto newDto = new CoursesDto();
//			newDto.setId(c.getId());
//			courses.add(newDto);
//		}
		
//		dto.setCoursesId(courses);
		
		return dto;
	
}

	public Student fromDto(StudentDto dto) {
		
		if(dto == null) {
			return null;
		}
		
		Student entity = new Student();
		entity.setId(dto.getId());
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setPersonalCode(dto.getPersonalCode());
		
		Set<Courses> courses = new HashSet<>();
		for(Long courseId : dto.getCoursesId()) {
			Courses course = new Courses();
			course.setId(courseId);
			courses.add(course);
		}
		
		entity.setEnrolledCourses(courses);
		
//		List<Courses> coursesId = new ArrayList<>();
//		for(Long s : dto.getCoursesId()) {
//			coursesId.add(new Courses(s));
//		}
		
		
		/*University university = new University();
		university.setId(dto.getUniversityId());
		entity.setUniversity(university);*/
		
//		Set<Courses> courses = new HashSet<>();
//		for(CoursesDto coursesDto : dto.getCoursesId()) {
//			Courses course = new Courses();
//			course.setId(coursesDto.getId());
//			course.add(courses);
//		}
		
//		entity.setEnrolledCourses(courses);;
		
//		Courses course = new Courses();
//		course.setId(dto.getCoursesId());
//		entity.setEnrolledCourses(course);
		
		return entity;
		
	}
	
	public List<StudentDto> toDtoList(List<Student> entities){
		List<StudentDto> dtos = new ArrayList<>();
		
		for(Student entity : entities) {
			dtos.add(toDto(entity));
		}
		
		return dtos;
	}
	
	public List<Long> toCourseIds(Set<Courses> entities){
		List<Long> courseIds = new ArrayList<>();
		
		for(Courses entity : entities) {
			courseIds.add(entity.getId());
		}
		
		return courseIds;
		
	}
}
 
