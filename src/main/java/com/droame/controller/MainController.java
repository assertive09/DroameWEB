package com.droame.controller;

import java.net.http.HttpRequest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.droame.entities.Booking;
import com.droame.entities.Customer;
import com.droame.repository.BookingRepository;
import com.droame.repository.CustomerRepository;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {

	@Autowired
	private CustomerRepository cr;

	@Autowired
	private BookingRepository br;
	@RequestMapping("/home")
	public String home(Model m) {

		List<Customer> customers = cr.getAllCustomer();
		m.addAttribute("customers", customers);
		return "home";
	}

	@RequestMapping("/add_form")
	public String addForm() {
		return "add_form";
	}

	@RequestMapping(path = "/add_user", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("customer") Customer customer) {
		cr.save(customer);
		return "redirect:home";
	}

	// add booking handlers
	@RequestMapping( "/booking_form/{id}")
	public String addBooking(@PathVariable("id")  int id)
	{
		Customer c=cr.findById(id);
	
	}
	
	public Stirng saveBookings() {
		Booking booking = new Booking(HttpServletRequest request);
		booking.setCustomer(c);
		br.save(booking);
		return "redirect:"+request.getContextPath()+"/home";
	}
	
	
	public CustomerRepository getCr() {
		return cr;
	}

	public void setCs(CustomerRepository cr) {
		this.cr = cr;
	}
}
