package com.employee.employee.storage.service.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.employee.storage.service.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value = "SELECT  b.name as company_name, ROUND(avg(a.salary), 2) as salary  from Employee a, Company b where a.company_id=b.id group by b.name order by salary desc", nativeQuery = true)
	List<Object[]> getEmployeesAvgSalary();
	

//
// @Transactional
// void deleteByEmployeeId(int empId);
}
