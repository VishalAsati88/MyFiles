package com.example.demorestapi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demorestapi.IService.IEmployeeService;
import com.example.demorestapi.Models.Employee;
import com.example.demorestapi.Repositories.EmployeeRepo;


import jakarta.transaction.Transactional;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeRepo repo;
	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Employee saveEmployee(Employee e) {
		Employee e1=repo.save(e);
		return e1;
	}

	@Override
	@SuppressWarnings("deprecation")
	@Transactional
	public Employee updateEmployee(Employee e) {
		
		Employee e1=repo.getOne(e.getId());
		if(e1!=null) {
			e1.setName(e.getName());
			e1.setCity(e.getCity());
			e1.setDept(e.getDept());
			e1=repo.save(e1);
		}
		return e1;
	}

	@Override
	public void deleteEmployee(int id) {
		repo.deleteById(id);
	}

}