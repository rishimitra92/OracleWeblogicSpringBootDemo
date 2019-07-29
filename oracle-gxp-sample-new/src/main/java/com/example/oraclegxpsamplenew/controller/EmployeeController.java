package com.example.oraclegxpsamplenew.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.oraclegxpsamplenew.model.Employee;
import com.example.oraclegxpsamplenew.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/list")
	public List<Employee> getAllEmployees(){
		//return "hello";
		System.out.println("Inside Controller. service returns: "+employeeService.getAllEmployees().toString());
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("/list")
	public void addEmployee(@RequestBody Employee e) {
		
		System.out.println("Creating a new Employee. Body: "+e.toString());
		employeeService.saveEmployee(e);
	}
	@PutMapping("/list/{empId}")
	public void updateEmployee(@RequestBody Employee e,@PathVariable("empId") Integer empId) {
		e.setEmpId(empId);
		employeeService.saveEmployee(e);
	}
	
	@DeleteMapping("/list/{empId}")
	public void deleteEmployee(@PathVariable("empId") Integer empId) {
		employeeService.deleteEmployee(empId);
	}
	
	@GetMapping("/list/{empId}")
	public Employee getEmployee(@PathVariable("empId") Integer empId) {
		return employeeService.getEmployee(empId);
	}
	
}
