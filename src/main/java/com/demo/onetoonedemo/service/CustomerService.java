package com.demo.onetoonedemo.service;

import com.demo.onetoonedemo.dao.CustomerRepo;
import com.demo.onetoonedemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    //Autowired - 1.Bean discovery
    //2.Bean wiring
    @Autowired
    private CustomerRepo customerRepo;

   public void save(Customer customer) {
       customerRepo.save(customer);
   }

    public List<Customer> findAll(){
        List<Customer> customerList = customerRepo.findAll();
        return customerList;
    }
}
