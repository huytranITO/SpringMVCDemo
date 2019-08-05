package com.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fa.model.Fresher;
import com.fa.service.LoginService;

@Controller
public class LogginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="login")
	public String showLogin(Model model) {
		model.addAttribute("fresher", new Fresher());
		return "/login/login";
	}
	
	@RequestMapping(value="dashboard")
	public String login(@ModelAttribute("fresher") Fresher fresher, Model model) {
		if(loginService.authenticate(fresher)) {
			model.addAttribute("fresher", fresher);
			return "/login/dashboard";
		} else {
			model.addAttribute("error", true);
			return "redirect:login";
		}
	}

}
