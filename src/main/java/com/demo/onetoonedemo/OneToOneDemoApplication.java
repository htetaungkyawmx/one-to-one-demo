package com.demo.onetoonedemo;

import com.demo.onetoonedemo.entity.Customer;
import com.demo.onetoonedemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OneToOneDemoApplication implements CommandLineRunner{

    @Autowired
    private CustomerService customerService;

    public static void main(String[] args) {
        SpringApplication.run(OneToOneDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       Customer aungaung = new Customer(1,"Aung Aung", 20);
       Customer maungmaung = new Customer(2,"Maung Maung", 22);
       customerService.save(aungaung);
       customerService.save(maungmaung);

       List<Customer> customerList = customerService.findAll();
       System.out.println(customerList);
    }
}
