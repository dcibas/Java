package com.example.demo.com.example.demo.dto;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoDto {

	private Long id;
	
	@NotBlank(message = "Type of Todo is required")
	private String type;
	
	@NotBlank(message = "Content of Todo is required")
	private String content;
	
	@NotNull
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;
	
	@NotNull
	private Long userId;
	
//	private Long UserId;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(@NotBlank(message = "Type of Todo is required") String Type) {
		this.type = Type;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(@NotBlank(message = "Content of Todo is required") String Content) {
		this.content = Content;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(@NotNull Date date) {
		this.date = date;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
