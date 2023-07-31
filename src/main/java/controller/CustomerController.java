package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import manager.CustomerManager;
import model.Customers;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/cust")
public class CustomerController {
	
	@Autowired
	CustomerManager manager;
	
	@GetMapping(value="/customers", headers="Accept=application/json")
	public String getCustomers()
	{
		return new Gson().toJson(manager.getCustomers());
	}
	@GetMapping(value="/singlecustomer/{id}", headers="Accept=application/json")
	public String retValue(@PathVariable int id)
	{
		System.out.println(id);
		Customers c = manager.getSingleCust(id);
		return new Gson().toJson(c);
	}
	
	@PostMapping(value="/addCustomer", headers="Accept=application/json")
	public void addCustomers(@RequestBody Customers customer)
	{
		manager.addCustomer(customer);
	}	
	@PostMapping(value="/validate", headers="Accept=application/json")
	public String getLoginD(@RequestBody Customers c) {
		HttpSession session = null ;
		String index="no";
		Customers c1 = manager.getSingleCust(c);
		if(c1!=null) {
			index="yes";
		}
		return index;
		
	}
	
	
	
	
	
	
	
	
}
