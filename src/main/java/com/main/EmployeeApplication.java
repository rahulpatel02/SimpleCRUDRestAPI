package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.main.emp.entity.Employee;
import com.main.emp.repository.EmpRepository;

@SpringBootApplication
public class EmployeeApplication{
	


	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	
	}
	

}
