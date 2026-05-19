package com.sumit.bankLab.service;

import com.sumit.bankLab.model.Customer;
import com.sumit.bankLab.repository.CustomerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customerList = customerRepository.findAll();
        return customerList;
    }

    @Override
    public Customer getCustomerById(Long customerId) {
//        Optional<Customer> customer = customerRepository.findById(customerId);
//
//        if(customer.isPresent()){
//            Customer foundCustomer =  customer.get();
//            return foundCustomer;
//        } else {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//        }

        return customerRepository.findById(customerId)
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
