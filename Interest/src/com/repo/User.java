package com.repo;

public class User {
	
	private String name;
	private String pwd;
	private String role;
	
	
	
	
	public User(String name, String pwd, String role) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
