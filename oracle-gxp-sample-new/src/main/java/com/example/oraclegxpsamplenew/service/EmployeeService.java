package com.example.oraclegxpsamplenew.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oraclegxpsamplenew.model.Employee;
import com.example.oraclegxpsamplenew.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> getAllEmployees(){
		System.out.println("Inside Service. repository returns: "+employeeRepository.findAll().toString());
		return employeeRepository.findAll();
	}
	
	public void saveEmployee(Employee e) {
		System.out.println("removed the sequence");
		System.out.println("Inside saveEmployee in service. E: "+e.toString());
		
		employeeRepository.save(e);
		
	}
	public void deleteEmployee(Integer empId) {
		employeeRepository.deleteById(empId);
	}
	public Employee getEmployee(Integer empId) {
		return employeeRepository.findById(empId).orElse(null);
	}
	
	
	
}
