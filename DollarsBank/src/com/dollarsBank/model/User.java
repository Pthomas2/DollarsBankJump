package com.dollarsBank.model;


public class User {
	

	private String username;
	
	private Long mbrId;
	
	private String fname;

	private String lname;

	private String email;

	private String password;
	
	public static void main(String[] args) {
		

	}

	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public Long getMbrId() {
		return mbrId;
	}




	public void setMbrId(Long mbrId) {
		this.mbrId = mbrId;
	}




	public String getFname() {
		return fname;
	}




	public void setFname(String fname) {
		this.fname = fname;
	}




	public String getLname() {
		return lname;
	}




	public void setLname(String lname) {
		this.lname = lname;
	}




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
	
	@Override
	public String toString() {
		return "{" +
			" mbrId='" + getMbrId() + "'" +
			", fname='" + getFname() + "'" +
			", lname='" + getLname() + "'" +
			", email='" + getEmail() + "'" +
			", username='" + getUsername() + "'" +
			", password='" + getPassword() + "'" +
			"}";
	}

	public User(String username, Long mbrId, String fname, String lname, String email, String password) {
		super();
		this.username = username;
		this.mbrId = mbrId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
	}

	public User() {
		super();
		
	}
	
	

	
	
}
