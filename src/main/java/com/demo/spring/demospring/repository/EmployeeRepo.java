package com.demo.spring.demospring.repository;

import com.demo.spring.demospring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;;;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
