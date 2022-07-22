package com.DemoProject.DemoProject_THymeleaf.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Employee {
	
	@Id
	String name;
	String email;
	String mobNo;
	String gender;
	String city;
	String married;


	public Employee() {
		super();
	}



	public Employee(String name, String email, String mobNo, String gender, String city, String married) {
		super();
		this.name = name;
		this.email = email;
		this.mobNo = mobNo;
		this.gender = gender;
		this.city = city;
		this.married = married;
	}
	
	

	public String getMarried() {
		return married;
	}



	public void setMarried(String married) {
		this.married = married;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", mobNo=" + mobNo + ", gender=" + gender + ", city="
				+ city + ", married=" + married + "]";
	}




}
