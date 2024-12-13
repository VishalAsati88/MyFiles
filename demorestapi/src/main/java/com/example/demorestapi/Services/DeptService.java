package com.example.demorestapi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demorestapi.IService.IDeptService;
import com.example.demorestapi.Models.Dept;
import com.example.demorestapi.Repositories.DeptRepo;

import jakarta.transaction.Transactional;

@Service
public class DeptService implements IDeptService{

	@Autowired
	private DeptRepo repo;
	@Override
	public List<Dept> getAllDepts() {
		
		return repo.findAll();
	}

	@Override
	public Dept saveDept(Dept d) {
		Dept dept=repo.save(d);
		return dept;
	}

	@Override
	@SuppressWarnings("deprecation")
	@Transactional
	public Dept updateDept(Dept d) {
		Dept d1=repo.getOne(d.getDeptid());
		if(d1!=null) {
			d1.setDeptname(d.getDeptname());
			d1=repo.save(d1);
		}
		return d1;
	}

	@Override
	public void deleteDept(int id) {
		repo.deleteById(id);;		
	}

}
