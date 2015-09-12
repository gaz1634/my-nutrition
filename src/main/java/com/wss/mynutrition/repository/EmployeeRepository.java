package com.wss.mynutrition.repository;

import org.springframework.data.repository.CrudRepository;

import com.wss.mynutrition.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {}