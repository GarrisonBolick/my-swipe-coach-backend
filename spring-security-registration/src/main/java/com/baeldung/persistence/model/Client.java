/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baeldung.persistence.model;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.baeldung.web.dto.ClientDto;

/**
 *
 * @author kolby
 */
@EntityScan
@Entity
public class Client {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="ClientAutoId")
    private Integer ClientAutoId;
public Client(){
    
}
  

     
   

	public Client(ClientDto clientDto) {
		
		this.FirstName = clientDto.getFirstName();
		this.LastName = clientDto.getLastName();
		this.DateOfBirth = clientDto.getDateOfBirth();
		this.Email = clientDto.getEmail();
		this.ContactNumber = clientDto.getContactNumber();
		
	}
	
    public Client(Integer clientAutoId, Integer quizAnswerId, Integer infoId, String firstName, String lastName, Date dateOfBirth,
		String email, String contactNumber, String paidFlag,Long userId) {
	
	this.ClientAutoId = clientAutoId;
	this.QuizAnswerId = quizAnswerId;
	this.InfoId = infoId;
	this.FirstName = firstName;
	this.LastName = lastName;
	this.DateOfBirth = dateOfBirth;
	this.Email = email;
	this.ContactNumber = contactNumber;
	this.PaidFlag = paidFlag;
	this.userId = userId;
}
    
    public void update(ClientDto clientDto) {
		
		this.FirstName = clientDto.getFirstName();
		this.LastName = clientDto.getLastName();
		this.DateOfBirth = clientDto.getDateOfBirth();
		this.Email = clientDto.getEmail();
		this.ContactNumber = clientDto.getContactNumber();
    }
    
    @Column(name="QuizAnswerId")
    private Integer QuizAnswerId; 
    @Column(name="InfoId")
    private Integer InfoId;
    @Column(name="FirstName")
    private String FirstName; 
    @Column(name="LastName")
    private String LastName;
    @Column(name="DateOfBirth")
    private Date DateOfBirth;
    @Column(name="Email")
    private String Email;
    @Column(name="ContactNumber")
    private String ContactNumber;
    @Column(name="PaidFlag")
    private String PaidFlag;
    @Column(name="User_id")
    private Long userId;






	public Long getUserId() {
		return userId;
	}







	public void setUserId(Long userId) {
		userId = userId;
	}







	public Integer getId() {
		return ClientAutoId;
	}







	public void setId(Integer id) {
		this.ClientAutoId = id;
	}







	public Integer getQuizAnswerId() {
		return QuizAnswerId;
	}







	public void setQuizAnswerId(Integer quizAnswerId) {
		QuizAnswerId = quizAnswerId;
	}







	public Integer getInfoId() {
		return InfoId;
	}







	public void setInfoId(Integer infoId) {
		InfoId = infoId;
	}







	public String getFirstName() {
		return FirstName;
	}







	public void setFirstName(String firstName) {
		FirstName = firstName;
	}







	public String getLastName() {
		return LastName;
	}







	public void setLastName(String lastName) {
		LastName = lastName;
	}







	public Date getDateOfBirth() {
		return DateOfBirth;
	}







	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}







	public String getEmail() {
		return Email;
	}







	public void setEmail(String email) {
		Email = email;
	}







	public String getContactNumber() {
		return ContactNumber;
	}







	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}







	public String getPaidFlag() {
		return PaidFlag;
	}







	public void setPaidFlag(String paidFlag) {
		PaidFlag = paidFlag;
	}







	

   
     
     
    
}
