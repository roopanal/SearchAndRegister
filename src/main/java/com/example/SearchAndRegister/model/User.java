package com.example.SearchAndRegister.model;

import javax.persistence.*;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String acceptRejectFlag;
	private String userSex;
	private String img;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String firstName, String lastName, String email, String password, String acceptRejectFlag, String userSex, String img) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.acceptRejectFlag = acceptRejectFlag;
		this.userSex = userSex;
		this.img = img;
	}

	public String getAcceptRejectFlag() {
		return acceptRejectFlag;
	}

	public void setAcceptRejectFlag(String acceptRejectFlag) {
		this.acceptRejectFlag = acceptRejectFlag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
