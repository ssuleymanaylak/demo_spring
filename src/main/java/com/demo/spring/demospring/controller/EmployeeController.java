package com.demo.spring.demospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.spring.demospring.model.Employee;
import com.demo.spring.demospring.repository.EmployeeRepo;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/emp")

public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @PostMapping("/add")
    Employee addEmployee(@RequestBody Employee employee) {
        employeeRepo.save(employee);
        return employee;
    }

    @GetMapping("/getAll")
    List<Employee> getEmployee() {
        List<Employee> employee = employeeRepo.findAll();
        return employee;
    }

}
