package com.LearningSpring.CRUD_APP_SPING.service;

import com.LearningSpring.CRUD_APP_SPING.dao.EmployeeDao;
import com.LearningSpring.CRUD_APP_SPING.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeDao employeeDao;

    //ADD employee
    public Employee saveEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    //Get all employees
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
//        employeeDao.findAll().forEach(e -> employees.add(e));
        employeeDao.findAll().forEach(employees::add);
        return employees;
    }

    //get specific employee
    public Employee getEmployee(Integer employeeId) {
        return employeeDao.findById(employeeId).orElseThrow();
    }

    //DeleteEmployee
    public void deleteEmployee(Integer employeeId) {
            employeeDao.deleteById(employeeId);
    }

    //update employee
    public Employee updateEmployee(Employee employee) {
        employeeDao.findById(employee.getEmployeeId()).orElseThrow();
        return employeeDao.save(employee);
    }

}
