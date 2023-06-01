package com.main.emp.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.emp.entity.Employee;

@Repository
public interface EmpRepository extends CrudRepository<Employee,Serializable> {

	
}
