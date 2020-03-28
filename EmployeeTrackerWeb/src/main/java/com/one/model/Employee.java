package com.one.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
//Scope(value = "prototype")
public class Employee {
	
	@Id
	private int id;
	private String empName;
	private String empDep;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDep() {
		return empDep;
	}
	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empDep=" + empDep + "]";
	}

	
}
