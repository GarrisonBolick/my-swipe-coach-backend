package com.baeldung.web.dto;

import java.util.Date;

import com.baeldung.persistence.model.Client;

public class CoachDto {
	
	public Integer id;
	public String token;
	public String firstName;
	public String lastName;
	public Date dateOfBirth;
	public String email;
	public String contactNumber;
	
	public CoachDto(Integer id, String token, String firstName, String lastName, Date dateOfBirth, String email,
			String contactNumber) {
		super();
		this.id = id;
		this.token = token;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.contactNumber = contactNumber;
	}
	
	public CoachDto(Client client) {
		this.id = client.getClientAutoId();
		this.firstName = client.getFirstName();
		this.lastName = client.getLastName();
		this.dateOfBirth = client.getDateOfBirth();
		this.email = client.getEmail();
		this.contactNumber = client.getContactNumber();
	}
	public CoachDto() {}
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	

}
