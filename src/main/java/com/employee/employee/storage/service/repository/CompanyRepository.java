package com.employee.employee.storage.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employee.storage.service.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
	

}