package com.example.demo.com.example.demo.entity;

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
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Courses {

//	public Courses(Long s) {
//	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@NotBlank
	@Column(name = "title")
	private String title;
	
	@ManyToMany
	@JoinTable(
	name = "enrolled_courses", 
        joinColumns = @JoinColumn(name = "course_id"), 
	inverseJoinColumns = @JoinColumn(name = "student_id"))
	Set<Student> enrolled;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Student> getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(Set<Student> enrolled) {
		this.enrolled = enrolled;
	}
	
}
