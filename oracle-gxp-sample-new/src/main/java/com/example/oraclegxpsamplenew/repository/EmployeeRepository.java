package com.example.oraclegxpsamplenew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.oraclegxpsamplenew.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	

	
}
