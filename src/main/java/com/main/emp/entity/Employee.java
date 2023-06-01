package com.main.emp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="EMPLOYEE")
public class Employee {

	     @Id
	     @Column(name = "ID")
		private int employeeId;
	     @Column(name = "NAME")
		private String empName;
	     @Column(name = "MOBILENO")
		private String mobNo;
	     @Column(name = "ADDRESS")
		private String empAddress;
	     
		public Employee() {
			super();
		}

		public Employee(int employeeId, String empName, String mobNo, String empAddress) {
			super();
			this.employeeId = employeeId;
			this.empName = empName;
			this.mobNo = mobNo;
			this.empAddress = empAddress;
		}

		public int getEmployeeId() {
			return employeeId;
		}

		public String getEmpName() {
			return empName;
		}

		public String getMobNo() {
			return mobNo;
		}

		public String getEmpAddress() {
			return empAddress;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public void setMobNo(String mobNo) {
			this.mobNo = mobNo;
		}

		public void setEmpAddress(String empAddress) {
			this.empAddress = empAddress;
		}
	     
}
