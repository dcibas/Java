package com.example.demo.com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "todo")
public class Todo {
	
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name = "Type")
	private String Type;
	
	@NotBlank
	@Column(name = "Content")
	private String Content;
	
	@NotNull
	@Column(name = "date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return Type;
	}

	public void setType(@NotBlank String Type) {
		this.Type = Type;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(@NotBlank String Content) {
		this.Content = Content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(@NotNull Date Date) {
		this.date = Date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
