package com.springbootH2.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootH2.demo.model.Customer;
import com.springbootH2.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customer -> customers.add(customer));
		return customers;
	}

	public Customer getCustomerById(int id) {
		return customerRepository.findById(id).get();
	}

	public void saveOrUpdate(Customer customer) {
		customerRepository.save(customer);
	}

	public void delete(int id) {
		customerRepository.deleteById(id);
	}
}
