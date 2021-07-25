package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.User;

@Controller
public class UserController {
	
	@Autowired
	private UserDAO userdao;
	
	@RequestMapping("index")
	public String index()
	{
		return "index.jsp";
	}
	
	@RequestMapping("addUser")
	public String addUser(User user)
	{
		userdao.save(user);
		return "index.jsp";
	}
	
	@RequestMapping("displayUser")
	public ModelAndView displayUser(@RequestParam int id)
	{
		ModelAndView mv = new ModelAndView("showUser.jsp");
		User user = userdao.findById(id).orElse(new User()); //latest change to handle exception
		mv.addObject(user);
		return mv;
	}
	
	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(@RequestParam int id)
	{
		ModelAndView mv = new ModelAndView("deleteUser.jsp");
		User user = userdao.findById(id).orElse(new User()); //latest change to handle exception
		userdao.deleteById(id);
		mv.addObject(user);
		return mv;
	}
	
	@RequestMapping("updateUser")
	public ModelAndView updateUser(User user)
	{
		ModelAndView mv = new ModelAndView("updateUser.jsp");
		user = userdao.findById(user.getId()).orElse(new User()); //latest change to handle exception
		userdao.deleteById(user.getId());
		mv.addObject(user);
		return mv;
	}

}
