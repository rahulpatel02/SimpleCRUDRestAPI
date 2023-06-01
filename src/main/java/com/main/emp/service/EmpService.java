package com.main.emp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.emp.entity.Employee;
import com.main.emp.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	public EmpRepository empRepository;
	
	public List<Employee> getAll(){
		List<Employee>Employees=new ArrayList<>();
		 empRepository.findAll().forEach(Employees::add);
	       return Employees;
}

	public Employee addEmp(Employee emp) {
		
		    empRepository.save(emp);
		    return emp;
		
	}
	
	public void updateEmp(String id,Employee emp) {
		empRepository.save(emp);
		
	}
	
	public void deleteEmp(String id) {
		empRepository.deleteById(id);
	}
}
