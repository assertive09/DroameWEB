package com.droame.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.droame.entities.Customer;
import com.droame.repository.CustomerRepository;

@Controller
public class MainController {
	
	@Autowired
	private CustomerRepository cs;
	
	@RequestMapping("/home")
	public String home(Model m) {
		
		List <Customer> customers=cs.getAllCustomer();
		m.addAttribute("customers" ,customers );
		return "home";
	}
	public CustomerRepository getCs() {
		return cs;
	}
	public void setCs(CustomerRepository cs) {
		this.cs = cs;
	}
}
