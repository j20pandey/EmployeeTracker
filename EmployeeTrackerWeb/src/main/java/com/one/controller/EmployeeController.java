package com.one.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.one.model.Employee;
import com.one.repository.EmployeeRepository;

import ch.qos.logback.classic.Logger;

@Controller
//@RestController
public class EmployeeController {
	
	//private static Logger log;

	@Autowired
	EmployeeRepository empRepo;

	// Mapping
	@RequestMapping("/")
	public String Home() {
		 return "HomeInfo";
		//return "DataTable";
	}

	@RequestMapping("/DataAdd")
	public String dataAdd() {
		return "AddData";
	}

	@RequestMapping("/Search")
	public String search() {
		return "SearchIndex";
	}

	@RequestMapping("/SearchId")
	public String searchId() {
		return "byId";
	}

	@RequestMapping("/SearchName")
	public String searchName() {
		return "byName";
	}

	@RequestMapping("/SearchDep")
	public String searchDepart() {
		return "byDepart";
	}

	// Data Add
	@RequestMapping("/Add")
	public ModelAndView display(Employee log) {
		empRepo.save(log);
		ModelAndView mv = new ModelAndView();
		mv.addObject("EmpData", log);

		mv.setViewName("DataView");
		return mv;
	}

	// Data Feach from DB by ID normal
	@RequestMapping("/feachh")
	public String feach(@RequestParam int id) {
		Employee emp = empRepo.findById(id).orElse(new Employee());
		System.out.println(emp);
		return emp.getEmpName();
	}

	// By Id
	@RequestMapping("/ViewId")
	public ModelAndView viewId(@RequestParam int id) {
		Employee emp1 = empRepo.findById(id).orElse(new Employee());
		ModelAndView mv = new ModelAndView();
		mv.addObject("EmpData", emp1);
		mv.setViewName("DataView");
		return mv;
	}

	@RequestMapping("/ViewName")
	public ModelAndView viewName(@RequestParam String empName) {
		List<Employee> empList = empRepo.findByempName(empName);
		Employee emp1 = new Employee();
		for (Employee em : empList) {
			emp1 = em;
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("EmpData", emp1);
		mv.setViewName("DataView");
		return mv;
	}

	@RequestMapping("/ViewDepart")
	public ModelAndView viewDepart(@RequestParam String empDep) {
		List<Employee> empList = empRepo.findByempDep(empDep);
		Employee emp1 = new Employee();
		for (Employee em : empList) {
			emp1 = em;
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("EmpData", emp1);
		mv.setViewName("DataView");
		return mv;
	}

	// Response Body Emp

	@RequestMapping("/Emp")
	@ResponseBody
	public String viewAll() {

		System.out.println("All Emp+++++++");

		return empRepo.findAll().toString();
	}
	
	//All Data
	@RequestMapping("/Emplist")
	public ModelAndView viewAll1() {
		List<Employee> empList = empRepo.findAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("EmpData", empList);
		System.out.println(empList.toString());
		mv.setViewName("DataTable");
		return mv;
	}
	
	
	@RequestMapping("/remove/{id}")
	public ModelAndView  DelEmployeeById(@PathVariable("id") int id) {
		empRepo.deleteById(id);
		List<Employee> empList = empRepo.findAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("EmpData", empList);
		System.out.println(empList.toString());
		mv.setViewName("DataTable");
		return mv;

	}
	
	// Path Variable
	

	@RequestMapping("/Get/{id}")
	@ResponseBody
	public String getEmp(@PathVariable("id") int id) {

		System.out.println("Get Emp+++++++");

		return empRepo.findById(id).toString();
	}

	// JSON
//	@RequestMapping("/AllEmp")
//	@ResponseBody
//	public Optional<Employee> viewAllEmp() {
//		
//		System.out.println("All Emp+++++++");
//		
//		return empRepo.findAll();
//	}

	@RequestMapping(path = "/EMP/{id}", produces = { "application/json" })
	// @RequestMapping("/EMP/{id}")
	@ResponseBody
	public Optional<Employee> getEmpByID(@PathVariable("id") int id) {

		System.out.println("Get Emp+++++++");

		return empRepo.findById(id);
	}

	@PostMapping("/Addemp")
	@ResponseBody
	public Employee addEmployee(@RequestBody Employee log) {
		empRepo.save(log);

		return log;

	}

	@DeleteMapping("/Del/{id}")
	@ResponseBody
	public String DelEmployee(@PathVariable("id") int id) {
		empRepo.deleteById(id);

		return "Delete";

	}

	@PutMapping("/Addemp")
	@ResponseBody
	public Employee putEmployee(@RequestBody Employee log) {
		empRepo.save(log);

		return log;

	}

}
