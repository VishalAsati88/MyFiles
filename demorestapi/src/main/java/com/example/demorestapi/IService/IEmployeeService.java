package com.example.demorestapi.IService;

import java.util.List;

import com.example.demorestapi.Models.Employee;


public interface IEmployeeService {
	List<Employee> getAllEmployees();
	Employee saveEmployee(Employee e) ;
	Employee updateEmployee(Employee e) ;
	void deleteEmployee(int id);
}
