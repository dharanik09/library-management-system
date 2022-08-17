package com.employee.employee.storage.service.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employee.storage.service.model.Company;
import com.employee.employee.storage.service.repository.CompanyRepository;

@Service
public class CompanyService {

	
	@Autowired
	private CompanyRepository companyRepository;

	
	@Transactional
	public List<Company> save(List<Company> company) {
		// TODO Auto-generated method stub
		return companyRepository.saveAll(company);
		
	}
}
