package com.olx.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OLXUSERS")
public class UserEntity {
	
	@Id
	@GeneratedValue
	private int id;

	private String firstName;
	
//	@Id
//	@Column(name = "UserName", nullable = false) 
//	@Column(columnDefinition = "text")
	private String userName;

	private String lastName;

	private String password;

	private String email;

	private double phone;

	public UserEntity(int id, String firstName, String userName, String lastName, String password, String email,
			double phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.userName = userName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public double getPhone() {
		return phone;
	}

	public void setPhone(double phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", firstName=" + firstName + ", userName=" + userName + ", lastName=" + lastName
				+ ", password=" + password + ", email=" + email + ", phone=" + phone + "]";
	}

}

