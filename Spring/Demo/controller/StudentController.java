package com.example.demo.com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.com.example.demo.dto.StudentDto;
import com.example.demo.com.example.demo.entity.Student;
import com.example.demo.com.example.demo.mapper.StudentMapper;
import com.example.demo.com.example.demo.repository.StudentRepo;
import com.example.demo.com.example.demo.service.StudentService;


@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	StudentMapper studentMapper;
	
	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/get")
	public StudentDto getStudent(@RequestParam Long id) {		
		return studentService.findById(id);		
	}
	
	@PostMapping("/add")
	public StudentDto createStudent(@RequestBody StudentDto student) {
		return studentService.createStudent(student);	
	}
	
	@PutMapping("/update")
	public StudentDto updateStudent(@RequestBody StudentDto student) {
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping("/delete")
	public void deleteStudent(@RequestParam Long id) {
		 studentService.deleteStudent(id);
	}
	
//	@GetMapping("/find-by-personal-code/{personalCode}")
//	public StudentDto findByPersonalCode(@PathVariable String personalCode) {
//		Student student = studentService.findByPersonalCode(personalCode);
//		return studentMapper.toDto(student);
//	}
	
	@GetMapping("/find-by-personal-code/{personalCode}")
	public long findByPersonalCode(@PathVariable String personalCode) {
		return studentService.findByPersonalCode(personalCode);
	}
	
//	@GetMapping("/find-by-personal-code/{personalCode}")
//	public Student findByLastName(@PathVariable String lastName) {
//		return studentService.findByLastName(lastName);
//	}
	
//	@GetMapping("/getdto")
//	public StudentDto findStudent(@RequestParam Long id) {
//		Student entity = studentRepo.findById(id).orElse(null);
//		return studentMapper.toDto(entity);
//	}
	
//	@PostMapping("/add")
//	public Student addStudent(@RequestBody StudentDto student) {
//		return studentRepo.save(student);	
//	}
	
	// dto
	
//	@PostMapping("/adddto")
//	public StudentDto postStudent(@RequestBody StudentDto student) {
//		return studentMapper.save(student);	
//	}
	
	
//	@PutMapping("/putdto")
//	public StudentDto putStudent(@RequestBody StudentDto student) {
		
//		Student existing = studentRepo.findById(student.getId()).orElse(null);
//		if(existing == null) {
//			throw new IllegalArgumentException("Student not found");
//		}

//		return studentRepo.save(student);
	 
//	}
	
//	@DeleteMapping("/deletedto")
//	public void removeStudent(@RequestParam Long id) {
		
//		Student entity = studentRepo.findById(id).orElse(null);
//		if(entity != null) {
//			studentRepo.deleteById(id);
//		}	
		
//	}
	
	// classic
	
//	@GetMapping("/get")
//	public Student getStudent(@RequestParam Long id) {
//		return studentRepo.findById(id).orElse(null);
//	}
	
		
//	@PutMapping("/put")
//	public Student updateStudent(@RequestBody StudentDto student) {
		
//		Student existing = studentRepo.findById(student.getId()).orElse(null);
//		if(existing == null) {
//			throw new IllegalArgumentException("Student not found");
//		}

//		return studentRepo.save(student);
		  
//	}

//	@DeleteMapping("/delete")
//	public void deleteStudent(@RequestParam Long id) {
		
//		Student entity = studentRepo.findById(id).orElse(null);
//		if(entity != null) {
//			studentRepo.deleteById(id);
//		}	
		
//	}
	
}
