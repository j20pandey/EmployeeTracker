package com.one.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.one.model.Employee;

//public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findByempName(String empName);

	List<Employee> findByempDep(String empDep);

}
