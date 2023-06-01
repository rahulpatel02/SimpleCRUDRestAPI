package com.main.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.EmployeeApplication;
import com.main.emp.entity.Employee;
import com.main.emp.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	EmpService empService;
	
	@GetMapping("/getemp")
	public List<Employee> getAll(){
		
		return empService.getAll();
		
	}
	
	@PostMapping(value="/addemp")
	 public ResponseEntity<Employee> addEmp(@RequestBody Employee emp) {
		return new ResponseEntity<Employee>(empService.addEmp(emp),HttpStatus.CREATED);
		
		
	}
	
	@PutMapping(value = "/updateemp/{id}")
	public void updateEmp(@PathVariable String id, @RequestBody Employee emp) {
		empService.updateEmp(id,emp);
	}
	
	@DeleteMapping(value = "deleteemp/{id}")
	public void deleteEmp(@PathVariable String id) {
		empService.deleteEmp(id);
	}

}
