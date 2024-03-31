package com.LearningSpring.CRUD_APP_SPING.controller;

import com.LearningSpring.CRUD_APP_SPING.entity.Employee;
import com.LearningSpring.CRUD_APP_SPING.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return  employeeService.saveEmployee(employee);
    }

    @GetMapping("/get/employee")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/get/employee/{employeeId}")
    public Employee getEmployee(@PathVariable Integer employeeId) {
        return employeeService.getEmployee(employeeId);
    }

    @DeleteMapping("/delete/employee/{employeeId}")
    public void deleteEmployee(@PathVariable Integer employeeId) {
        employeeService.deleteEmployee(employeeId);
    }

    @PutMapping("/update/employee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }




}
