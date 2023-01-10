package com.example.demo.com.example.demo.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.com.example.demo.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student,Long> {

	public List<Student> findAllByUniversity_Id(Long universityId);
	
	public List<Student> findAllByEnrolledCourses_Id(Long courseId);
	
	Student findByPersonalCode(String personalCode);
	
     // Student findByLastName(String lastName);
	
	List<Student> findByFirstNameStartingWith(String personalCode);
	
	long countByFirstNameStartingWith(String personalCode);
	
	long countByLastNameStartingWith(String personalCode);
	
}
