package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.DAO.PersonDAO;
import com.example.demo.model.Person;

@Controller
public class PersonController {
	
	@Autowired
	PersonDAO personDao;
	
	@RequestMapping("/index")
	public String index()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/addPerson")
	public ModelAndView addPerson(Person person)
	{
		ModelAndView mv = new ModelAndView("addedPerson.jsp");
		personDao.save(person);
		mv.addObject(person);
		return mv;
	}
	
	@RequestMapping("/getPerson")
	public ModelAndView getPerson(@RequestParam long num)
	{
		ModelAndView mv = new ModelAndView("getPerson.jsp");
		Person person = personDao.findById(num).orElse(new Person());
		mv.addObject(person);
		return mv;
	}
	
	@RequestMapping("/updatePerson")
	public ModelAndView updatePerson(Person person)
	{
		ModelAndView mv = new ModelAndView("updatePerson.jsp");
		person = personDao.findById(person.getNum()).orElse(new Person());
		mv.addObject(person);
		return mv;
	}
	
	@RequestMapping("/updatedPerson")
	public ModelAndView updatedPerson(Person person)
	{
		ModelAndView mv = new ModelAndView("updatedShowPerson.jsp");
		personDao.save(person);
		mv.addObject(person);
		return mv;
	}
	
	@RequestMapping("/deletePerson")
	public ModelAndView deletePerson(@RequestParam long num)
	{
		ModelAndView mv = new ModelAndView("deletedPerson.jsp");
		Person person = personDao.findById(num).orElse(new Person());
		personDao.delete(person);
		mv.addObject(person);
		return mv;
	}
	

}
