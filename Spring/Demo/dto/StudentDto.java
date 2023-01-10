package com.example.demo.com.example.demo.dto;

import java.util.List;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

	private Long id;

	@NotBlank(message = "Name section cannot be blank")
	private String firstName;

	@NotBlank(message = "Last name section cannot be blank")
	private String lastName;

	@NotBlank(message = "Personal code cannot be blank")
	private String personalCode;
	
	private Long universityId;
	
	private List<Long> coursesId;

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

	public Long getUniversityId() {
		return universityId;
	}

	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}

	public List<Long> getCoursesId() {
		return coursesId;
	}

	public void setCoursesId(List<Long> coursesId) {
		this.coursesId = coursesId;
	}

     // private Long coursesId;
	
     // private List<CoursesDto> studentCourses;
	
}
