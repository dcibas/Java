package com.example.demo.com.example.demo.dto;

import java.util.List;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data
@AllArgsConstructor
@NoArgsConstructor
public class CoursesDto {

	private Long id;
	
	@NotBlank(message = "Title is required")
	private String title;
	
     // private List<Long> studentsId;
	
	private List<StudentDto> students;

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

	public List<StudentDto> getStudents() {
		return students;
	}

	public void setStudents(List<StudentDto> students) {
		this.students = students;
	}
	
	
}
