package com.harshvardhan.blog.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity 
@NoArgsConstructor
@Getter
@Setter
@Table(name="Users")
public class User extends BaseEntity {
	
	
	@Column(name="user_name", nullable=false, length=100)
	private String name;
	private String email;
	private String password;
	private String about;
	public void setId(int id2) {
		id=id2;
		// TODO Auto-generated method stub
		
	}
	public void setEmail(String email2) {
		email=email2;
		// TODO Auto-generated method stub
		
	}
	public void setPassword(String password2) {
		// TODO Auto-generated method stub
		password=password2;
		
	}
	public void setAbout(String about2) {
		// TODO Auto-generated method stub
		about=about2;
	}
	public void setName(String name2) {
		// TODO Auto-generated method stub
		name=name2;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return (int) id;
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
	
	
	

}
