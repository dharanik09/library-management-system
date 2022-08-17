package com.employee.employee.storage.service.services;

import java.text.DecimalFormat;

public class AvgSalary {
	
	private String companyName;
	private double salary;
	
	public AvgSalary(String companyName, String salary) {
		// TODO Auto-generated constructor stub
		this.companyName = companyName;
		this.salary = Double.parseDouble(salary);
	}

	public String getCompanyName() {
		return companyName;
	}

	public double getSalary() {
		return salary;
	}
	
	

}
