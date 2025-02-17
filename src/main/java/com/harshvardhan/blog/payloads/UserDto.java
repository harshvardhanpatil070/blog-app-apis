package com.harshvardhan.blog.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@Setter
@Getter
@AllArgsConstructor 
public class UserDto {
	private int id;
	private String name;
	private String email;
	private String password; 
	private String about;
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	public String getAbout() {
		// TODO Auto-generated method stub
		return about;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public void setId(int id2) {
		id=id2;
		// TODO Auto-generated method stub
		
	}
	public void setEmail(String email2) {
		email=email2;
		// TODO Auto-generated method stub
		
	}
	public void setPassword(String password2) {
		password=password2;
		// TODO Auto-generated method stub
		
	}
	public void setAbout(String about2) {
		about=about2;
		// TODO Auto-generated method stub
		
	}
	public void setName(String name2) {
		name=name2;
		// TODO Auto-generated method stub
		
	}
	


}
