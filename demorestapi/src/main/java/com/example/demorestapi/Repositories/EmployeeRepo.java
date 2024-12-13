package com.example.demorestapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demorestapi.Models.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
