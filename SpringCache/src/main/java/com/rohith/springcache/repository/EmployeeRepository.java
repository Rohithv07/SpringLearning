package com.rohith.springcache.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohith.springcache.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
