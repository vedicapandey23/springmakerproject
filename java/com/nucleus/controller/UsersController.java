package com.nucleus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.nucleus.model.Users;
import com.nucleus.service.IUsersService;


@Controller
public class UsersController {

	@Autowired
	IUsersService iUsersService;
	
	
	@RequestMapping("/cmaker")
	public String makertask()
	{
		return "makertask";
	}
	
	@RequestMapping("/cchecker")
	public String checkertask()
	{
		return "checkertask";
	}
	
	@RequestMapping("/cloginsecurity")
	public String loginsecurity()
	{
		return "loginsecurity";
	}
	
	
	@RequestMapping("/cloginfailure")
	public String loginfailure(Model model)
	{
		model.addAttribute("statusfail","Wrong credentials,try again");
		return "loginsecurity";
	}
	
	@GetMapping(value="/caccessdenied")
	public String accessdenied(Model model)
	{
		model.addAttribute("statusdenied", "Unauthorized user");
		return "loginsecurity";
	}
	
	@RequestMapping("/cregisteruser")
	public ModelAndView registeruser(Users users)
	{
		return new ModelAndView("registeruser");
		
	}
	
	@RequestMapping("/cregisteruser1")
	public ModelAndView registeruser1(Users users,Model model)
	{
		
		iUsersService.saveData1(users);
		model.addAttribute("statusrecord", "You are successfully registered!");
		return new ModelAndView("loginsecurity");
		
	}
	
	
}
