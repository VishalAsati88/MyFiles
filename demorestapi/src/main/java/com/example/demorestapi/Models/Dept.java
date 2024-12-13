package com.example.demorestapi.Models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
@Table(name="dept")
public class Dept {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="deptid")
	private int deptid;
	@Column(name="deptname")
	private String deptname;
	@OneToOne(mappedBy = "dept", cascade = CascadeType.ALL)
	private Employee emp;
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
}
