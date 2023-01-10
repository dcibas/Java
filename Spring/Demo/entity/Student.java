package com.example.demo.com.example.demo.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {

//	public Student(Long s) {
//	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@NotBlank
	@Column(name = "first_name")
	private String firstName;

	@NotBlank
	@Column(name = "last_name")
	private String lastName;

	@NotBlank
	@Column(name = "personal_code")
	private String personalCode;
	
	@ManyToOne
	@JoinColumn(name = "university_id")
	private University university;
	
	@ManyToMany
	@JoinTable(
	name = "enrolled_courses", 
	joinColumns = @JoinColumn(name = "student_id"), 
	inverseJoinColumns = @JoinColumn(name = "course_id"))
	Set<Courses>enrolledCourses = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPersonalCode() {
		return personalCode;
	}

	public void setPersonalCode(String personalCode) {
		this.personalCode = personalCode;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public Set<Courses> getEnrolledCourses() {
		return enrolledCourses;
	}

	public void setEnrolledCourses(Set<Courses> enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}
			
//	List<Courses>enrolledCourses;
	
}
