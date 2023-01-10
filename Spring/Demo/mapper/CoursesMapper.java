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

@Service
public class CoursesMapper {

//	@Autowired
//	StudentService studentService;
	
	public CoursesDto toDto(Courses entity) {
		if(entity == null) {
			return null;
		}
	
		CoursesDto dto = new CoursesDto();
		dto.setId(entity.getId());
		dto.setTitle(entity.getTitle());
		
//		List<Long> studentsId = new ArrayList<>();
//		for(Student s : entity.getEnrolled()) {
//			studentsId.add(s.getId());
//		}
	
//		dto.setStudentsId(studentsId);
		
//		List<StudentDto> studentsSet = new ArrayList<>();
		Set<Student> studentsSet = entity.getEnrolled();
		List<StudentDto> studentsDtoList = new ArrayList<>();
		
		for(Student s : studentsSet) {
			StudentDto newDto = new StudentDto();
			
			newDto.setId(s.getId());
			studentsDtoList.add(newDto);
//			newDto.setId(s.getId());
//			studentsSet.add(s.getId());
		}
		
		dto.setStudents(studentsDtoList);
	
		return dto;
	
}

	public Courses fromDto(CoursesDto dto) {
		
		if(dto == null) {
			return null;
		}
		
		Courses entity = new Courses();
		entity.setId(dto.getId());
		entity.setTitle(dto.getTitle());
			
//		List<Student> students = new ArrayList<>();
		Set<Student> students = new HashSet<>();
		
		for(StudentDto studentDto : dto.getStudents()) {
			Student student = new Student();
			student.setId(studentDto.getId());
			students.add(student);
		}
		
		entity.setEnrolled(students);
		
		return entity;
		
//		for(Long s : dto.getStudentsId()) {
//			students.add(new Student(s));
//		}
		
//		Set<Student> students = new HashSet<>();
//		for(StudentDto studentDto : dto.getStudents()) {
//			Student student = new Student();
//			student.setId(studentDto.getId());
//			students.add(student);
//		}
		
		
	}
	
	public List<CoursesDto> toDto(List<Courses> entities) {
		
		List<CoursesDto> dtos = new ArrayList<>();
		
		for(Courses entity : entities) {
			dtos.add(toDto(entity));
		}
		
		return dtos;
			
	}
	
}
