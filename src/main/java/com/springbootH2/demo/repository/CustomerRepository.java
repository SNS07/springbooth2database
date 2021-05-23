package com.springbootH2.demo.repository;
import org.springframework.data.repository.CrudRepository;

import com.springbootH2.demo.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
