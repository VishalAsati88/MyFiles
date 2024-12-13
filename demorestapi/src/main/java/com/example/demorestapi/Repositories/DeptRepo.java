package com.example.demorestapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demorestapi.Models.Dept;


public interface DeptRepo extends JpaRepository<Dept, Integer> {

}
