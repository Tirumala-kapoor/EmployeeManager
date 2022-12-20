package com.angular.springboot.employeemanager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angular.springboot.employeemanager.model.Employee;
/**
 * 
 * @author Tirumala
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	void deleteEmployeeById(Long id);

	Optional<Employee> findEmployeeById(Long id);

}
