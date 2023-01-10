package com.example.demo.com.example.demo.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupDto {
	
	@Email
	@NotBlank
	@Size(max = 50)
	private String email;

	@Size(min = 6, max = 20)
	@NotBlank
	private String password;
	
	@Size(min = 6, max = 20)
	@NotBlank
        private String repeatPassword;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}	
		
}
