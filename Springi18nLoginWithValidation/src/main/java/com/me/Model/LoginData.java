package com.me.Model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginData
{
	@NotEmpty(message="Must Not Empty")
	private String UserName;
	
	
	@NotNull
	@Size(min=4, max=10, message="Too Short or Too Long password")
	private String password;
	
	
	
	
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
}
