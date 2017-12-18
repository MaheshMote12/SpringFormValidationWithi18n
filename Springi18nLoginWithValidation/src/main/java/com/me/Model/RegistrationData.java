package com.me.Model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class RegistrationData 
{
	@NotNull
	@NotEmpty(message="fhfgh")
	private String UserName;
	
	@NotNull
	@NotEmpty(message="password must not empty")
	@Size(min=4, max=10, message="password must be min 4 and max 10")
	private String password;
	
	@NotEmpty(message="email is empty")
	@Email()
	private String email;
	
	@NotEmpty(message="sex not selected?")
	private String sex;
	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
