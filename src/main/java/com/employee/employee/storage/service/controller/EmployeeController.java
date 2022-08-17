package com.employee.employee.storage.service.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.storage.service.model.Employee;
import com.employee.employee.storage.service.services.AvgSalary;
import com.employee.employee.storage.service.services.EmployeeService;

@CrossOrigin(origins = "http://loclhost:8083")
@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping
	String index() {
		return "Welcome EPF";
		
	}
	
	@PostMapping("/employeeas")
	String indexs() {
		return "Welcome EBF";
		
	}
	@PostMapping("/{comapnyId}/employees")
	List<Employee> newEmployee(@PathVariable("comapnyId") int comapnyId, @RequestBody List<Employee> newEmployee) {
		return employeeservice.save(comapnyId, newEmployee);
	}
	
	@PutMapping("/updateEmployees/{comapnyId}")
	Employee updateEmployees(@RequestBody Employee updateEmployee, @PathVariable("comapnyId") int comapnyId) {
	  return employeeservice.update(updateEmployee, comapnyId);
	}
	
	//http://localhost:8083/api/getEmployeesDetails
	@GetMapping("/getEmployeesDetails")
	List<Employee> getEmployeeDetails(){
		  return employeeservice.getEmployeeDetails();
	}
	
//	@DeleteMapping("/deleteEmployeesDetails/{employeeId}")
//	public ResponseEntity<HttpStatus> deleteEmployeeDetails(@PathVariable("employeeId") int employeeId){
//		  //return employeeservice.deleteEmployeeDetailsbyID(employeeId);
//	}
	@DeleteMapping("/deleteEmployeesByID")
	public ResponseEntity<HttpStatus> deleteEmployeesByID(@RequestBody Employee deleteEmployee){
		  return employeeservice.deleteEmployeeDetailsbyID(deleteEmployee);
	}
	
	@GetMapping("/getEmployeesAvgSalary")
	List<AvgSalary> getEmployeesAvgSalary(){
		return employeeservice.getEmployeesAvgSalary();
	}
	

}//End of Class EmployeeController
