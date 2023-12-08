package com.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table (name="Employee")
public class Employee 
{
	private int eid;
	String ename,desg;
	Department dept;
	@Id
	@GenericGenerator(name = "increment" ,strategy = "increment")
	@GeneratedValue(generator = "increment")
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
		
	}
	
	@ManyToOne
	@JoinColumn(name="did")
 public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}

	}
	
	
