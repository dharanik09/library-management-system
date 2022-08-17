package com.employee.employee.storage.service.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.employee.storage.service.model.Company;
import com.employee.employee.storage.service.model.Employee;
import com.employee.employee.storage.service.repository.CompanyRepository;
import com.employee.employee.storage.service.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeerepository;

	@Autowired
	private EntityManager entityManager;

	

	@Transactional
	public List<Employee> save(int comapnyId, List<Employee> newEmployee) {
		// TODO Auto-generated method stub
		// create Artist object
			Company company = entityManager.getReference(Company.class, comapnyId);
			//companyropsitory.findById(1);#
			for (Employee employee : newEmployee) {
				employee.setCompany(company);
			}
			return employeerepository.saveAll(newEmployee);
		
	}
	

	public List<Employee> getEmployeeDetails() {
		// TODO Auto-generated method stub
			return employeerepository.findAll();
		
	}


	public Employee update(Employee updateEmployee, int comapnyId) {
		// TODO Auto-generated method stub
		Company company = entityManager.getReference(Company.class, comapnyId);
		updateEmployee.setCompany(company);
		return employeerepository.save(updateEmployee);
	}


	public ResponseEntity<HttpStatus> deleteEmployeeDetailsbyID(Employee deleteEmployee) {
		// TODO Auto-generated method stub
		 employeerepository.delete(deleteEmployee);
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}


	@SuppressWarnings("unchecked")
	public List<AvgSalary> getEmployeesAvgSalary() {
		List<Object[]> results = employeerepository.getEmployeesAvgSalary();
		List<AvgSalary> avgSalary = new ArrayList<AvgSalary>();

		for (Object[] obj : results) {
			System.out.println(new AvgSalary((String) obj[0], String.valueOf(obj[1])));
			avgSalary.add(new AvgSalary((String) obj[0], String.valueOf(obj[1])));
		}
		return avgSalary;
	}

}
