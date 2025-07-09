package com.op_solutions.data_api.entity;

import java.time.LocalDate;

import com.op_solutions.data_api.util.DateUtil;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER_DATA")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address personalAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address currentAddress;
	
	private LocalDate birthDate;
	
	private Integer age;
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Address getPersonalAddress() {
		return personalAddress;
	}
	public void setPersonalAddress(Address personalAddress) {
		this.personalAddress = personalAddress;
	}
	public Address getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
		this.age = DateUtil.calculateAge(birthDate);
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	
	

}
