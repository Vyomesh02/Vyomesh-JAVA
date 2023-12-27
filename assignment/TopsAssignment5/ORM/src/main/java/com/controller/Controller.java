package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.EmpDao;
import com.model.Emp;

@org.springframework.stereotype.Controller
public class Controller 
{
	@Autowired
	EmpDao dao;
	
	@RequestMapping("/empform")
	public String empForm()
	{	
		return "empForm";
	}
	
	@RequestMapping("/viewemp")
	public String viewEmp(Model m)
	{
		List<Emp> emp=dao.getAll();
		m.addAttribute("emp", emp);
		return "viewAllEmp";
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String save(@ModelAttribute("emp") Emp emp)
	{
		dao.insert(emp);
		return "redirect:/viewemp";
	}
	
	@RequestMapping(value = "/edit/{id}")
	public String editForm(@PathVariable int id, Model m)
	{
		Emp emp=dao.getById(id);
		m.addAttribute("emp", emp);
		return "editEmp";
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String update(@ModelAttribute("emp") Emp emp)
	{
		dao.update(emp);
		return "redirect:/viewemp";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id)
	{
		dao.delete(id);
		return "redirect:/viewemp";
	}
}
