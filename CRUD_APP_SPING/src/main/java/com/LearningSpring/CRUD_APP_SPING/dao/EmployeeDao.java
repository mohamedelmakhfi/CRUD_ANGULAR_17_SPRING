package com.LearningSpring.CRUD_APP_SPING.dao;

import com.LearningSpring.CRUD_APP_SPING.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends CrudRepository<Employee , Integer> { /* nom entity , type de primary key */


}
