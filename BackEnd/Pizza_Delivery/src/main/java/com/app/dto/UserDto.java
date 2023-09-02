package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// id , contact_no , email, name,password,role
@Getter
@Setter
@ToString(exclude = "password")
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

	private int id;
	private String contact_no;
	private String email;
	private String name;
	private String password;
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public UserDto(int id, String contact_no, String email, String name, String password, String role) {
		super();
		this.id = id;
		this.contact_no = contact_no;
		this.email = email;
		this.name = name;
		this.password = password;
		this.role = role;
	}
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", contact_no=" + contact_no + ", email=" + email + ", name=" + name
				+ ", password=" + password + ", role=" + role + "]";
	}
	
	
	
	
}
