package com.example.demo.com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.com.example.demo.dto.StudentDto;
import com.example.demo.com.example.demo.entity.Student;
import com.example.demo.com.example.demo.mapper.StudentMapper;
import com.example.demo.com.example.demo.repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    @Autowired
    StudentMapper mapper;

    public StudentDto findById (Long id) {
    	
        Student student = repo.findById(id).orElse(null);
       
        return mapper.toDto(student);
        
    }
    
//    public List<ToDoTaskDto> getAllTasks() {

//      List<ToDoTask> tasks = (List<ToDoTask>) repo.findAll();
//      return mapper.toDtoList(tasks);

//  }
    
    public StudentDto createStudent (StudentDto studentDto) {
    	
        Student student = mapper.fromDto(studentDto);
        
        repo.save(student);
        
        return mapper.toDto(student);
     
    }

    public StudentDto updateStudent (StudentDto studentDto) {
    	
        Student student = mapper.fromDto(studentDto);

        repo.save(student);
        
        return mapper.toDto(student);
        
    }

    public void deleteStudent (Long id) {
    	
        repo.deleteById(id);
        
    }
    
    public List<StudentDto> findStudentsByUniversityId(Long universityId) {  	
    	
    	List<Student> students = repo.findAllByUniversity_Id(universityId);
    	
    	return mapper.toDtoList(students);
    	
    }
    
    public List<Student> findStudentsByCourseId(Long courseId) {  	
    	
    	List<Student> students = repo.findAllByEnrolledCourses_Id(courseId);
    	
    	return students;
    	
    }
  
    public long findByPersonalCode(String personalCode) {
    	
	  return repo.countByLastNameStartingWith(personalCode);
	  
    }
 
//  public Student findByLastName(String lastName) {

//	  return repo.findByLastName(lastName);

//  }

}
