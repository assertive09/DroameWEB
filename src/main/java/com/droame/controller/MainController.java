package com.droame.controller;

import java.net.http.HttpRequest;
import java.security.Principal;
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
import com.droame.entities.Drone;
import com.droame.entities.Location;
import com.droame.repository.BookingRepository;
import com.droame.repository.CustomerRepository;
import com.droame.repository.DroneRepository;
import com.droame.repository.LocationRepository;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {

	@Autowired
	private CustomerRepository cr;

	@Autowired
	private BookingRepository br;

	@Autowired
	private LocationRepository lr;

	@Autowired
	private DroneRepository dr;

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
	@RequestMapping("/booking_form/{id}")
	public String bookingForm(@PathVariable("id") int id, Model m, HttpServletRequest request) {
		List<Location> locations = lr.getAllLocations();
		m.addAttribute("locations", locations);
		List<Drone> drones = dr.getAllDrones();
		m.addAttribute("drones", drones);
		m.addAttribute("id", id);
		return "add_booking";

	}

	@RequestMapping(path = "/add_booking", method = RequestMethod.POST)
	public RedirectView saveBookings(HttpServletRequest request, @RequestParam("lId") int lId,
			@RequestParam("dId") int dId, @RequestParam("cId") int cId) {
		
		// Fetching data
		Customer customer = cr.findById(Integer.parseInt(request.getParameter("cId")));
		Drone drone = dr.findById(dId);
		Location location = lr.findById(lId);
		System.out.println(customer);
		System.out.println(drone);
		System.out.println(location);
		Booking booking = new Booking();
		booking.setCustomer(customer);
		booking.setDrones(drone);
		booking.setLocation(location);
		drone.setBooking(booking);
		location.setBooking(booking);
		customer.setBookings(booking);
		cr.save(customer);
		RedirectView rv = new RedirectView();
		rv.setUrl(request.getContextPath() + "/home");
		return rv;
	}

	public CustomerRepository getCr() {
		return cr;
	}

	public void setCs(CustomerRepository cr) {
		this.cr = cr;
	}
}
