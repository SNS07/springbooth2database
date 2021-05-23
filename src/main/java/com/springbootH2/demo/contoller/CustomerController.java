package com.springbootH2.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootH2.demo.model.Customer;
import com.springbootH2.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
    CustomerService customerService;
	
	    @GetMapping("/customers")
	    private List<Customer> getAllCustomers() {
	        return customerService.getAllCustomers();
	    }
	 
	    @GetMapping("/customers/{id}")
	    private Customer getCustomer(@PathVariable("id") int id) {
	        return customerService.getCustomerById(id);
	    }
	 
	    @DeleteMapping("/customers/{id}")
	    private void deleteCustomer(@PathVariable("id") int id) {
	    	customerService.delete(id);
	    }
	 
	    @PostMapping("/customers")
	    private int saveCustomer(@RequestBody Customer customer) {
	    	customerService.saveOrUpdate(customer);
	        return customer.getId();
	    }

}
