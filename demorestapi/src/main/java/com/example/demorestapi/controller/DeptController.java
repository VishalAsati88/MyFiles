package com.example.demorestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demorestapi.IService.IDeptService;
import com.example.demorestapi.Models.Dept;




@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private IDeptService service;
	@GetMapping("/getdepts")
	public List<Dept> getAllDepts(){
		try
		{
		List<Dept> list= service.getAllDepts();
		return list;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}
	
	@PostMapping("/saveDept")
	public Dept saveDept(@RequestBody Dept d) {
		Dept d1=null;
		try
		{
	     d1=service.saveDept(d);		
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return d1;
	}
	@PutMapping("/updateDept")
	public Dept updateDept(@RequestBody Dept d) {
		Dept res=null;
		try
		{
			res=service.updateDept(d);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return res;
	}
	
	@DeleteMapping("/deleteDept/{id}")
	public void deleteDept(@PathVariable int id) {
		try
		{
			service.deleteDept(id);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
