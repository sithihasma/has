package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Repository
public class Homecontroller {
	@RequestMapping(value = { "/", "/Home" })
	public String goToHome(Model model) {
		model.addAttribute("message", "Thank you for visiting Shopping Cart");
		return "Home";
	}

	@RequestMapping("/Cart")
	public String basket(Model model) {
		model.addAttribute("message", "your products");
		return "Cart";
	}

	@RequestMapping("/AboutUs")
	public String aboutus(Model model) {
		model.addAttribute("message", "Website Info");
		return "AboutUs";

	}
	@RequestMapping("/addProduct")
	public String addProduct(Model model) {
		model.addAttribute("message", "Website Info");
		return "addProduct";

	}

	@RequestMapping("/ContactUs")
	public String contactus(Model model) {
		model.addAttribute("message", "Website Info");
		return "ContactUs";
	}

	@RequestMapping("/Category")
	public String category(Model model) {
		model.addAttribute("message", "Website Info");
		return "Category";
	}


	
	@RequestMapping("/access-denied")
	public String accessDenied(Model model) {
		ModelAndView model1=new ModelAndView("error");
		model1.addObject("title","403, Access denied");
		model1.addObject("errorTitle","you are not authorize to this page");
		
		return "model1";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(name = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("message", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("message", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;

	}
	

	


}
