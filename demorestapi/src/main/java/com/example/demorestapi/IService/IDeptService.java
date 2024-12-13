package com.example.demorestapi.IService;

import java.util.List;


import com.example.demorestapi.Models.Dept;


public interface IDeptService {
	List<Dept> getAllDepts();
	Dept saveDept(Dept d) ;
	Dept updateDept(Dept d) ;
	void deleteDept(int id);
}
