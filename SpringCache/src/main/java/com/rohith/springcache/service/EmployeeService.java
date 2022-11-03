package com.rohith.springcache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.rohith.springcache.model.Employee;
import com.rohith.springcache.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Cacheable(value = "employee", key = "#id")
	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}

	@CachePut(value = "employee", key = "#employee.id")
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@CacheEvict(value = "employee", key = "#id")
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}

}
