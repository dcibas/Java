package com.example.demo.com.example.demo.dto;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

	private Long id;
	
//	@NotBlank(message = "Please enter a valid full name")
	private String name;
	
//	@NotBlank(message = "Please enter a valid last name")
	private String lastName;
	
	@Email(message = "Please enter a valid email")
	private String email;
	
//	@NotNull(message = "Please enter a valid date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;
	
	private List<TodoDto> todos;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(@Email(message = "Please enter a valid email") String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<TodoDto> getTodos() {
		return todos;
	}

	public void setTodos(List<TodoDto> todos) {
		this.todos = todos;
	}
	
}
