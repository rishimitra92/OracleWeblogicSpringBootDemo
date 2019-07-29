package com.example.oraclegxpsamplenew.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="OALEGO_EMPLOYEE_TAB")
public class Employee {
	@Id
	@SequenceGenerator(name="OALEGO_EMPLOYEE_SEQ",sequenceName = "OALEGO_EMPLOYEE_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "OALEGO_EMPLOYEE_SEQ")
	@Column(name = "EMP_ID",nullable = false)
	private Integer empId;
	
	@Column(name = "FIRST_NAME",length = 50)
	private String firstName;
	
	@Column(name = "LAST_NAME",length = 50)
	private String lastName;
	
	@Column(name = "EMAIL",length = 50)
	private String email;

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Employee(Integer empId, String firstName, String lastName, String email) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	
	

}
