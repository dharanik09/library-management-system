package com.employee.employee.storage.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.storage.service.model.Company;
import com.employee.employee.storage.service.model.Employee;
import com.employee.employee.storage.service.services.CompanyService;
import com.employee.employee.storage.service.services.EmployeeService;

@CrossOrigin(origins = "http://loclhost:8083")
@RestController
@RequestMapping("/api")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/addCompany")
	List<Company> addCompany(@RequestBody List<Company> addCompany) {
		return companyService.save(addCompany);
	}
	

}
