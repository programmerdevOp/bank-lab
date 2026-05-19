package com.sumit.bankLab.controller;

import com.sumit.bankLab.model.Customer;
import com.sumit.bankLab.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api/")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }


    @PostMapping("api/public/customer")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        Customer savedCustomer = customerService.createCustomer(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    @GetMapping("api/public/customer")
    public ResponseEntity<List<Customer>> getAllCustomer(){
       List<Customer> customerList = customerService.getAllCustomer();
       return new ResponseEntity<>(customerList, HttpStatus.OK);
    }
}
