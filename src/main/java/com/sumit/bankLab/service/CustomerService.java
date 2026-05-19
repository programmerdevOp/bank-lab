package com.sumit.bankLab.service;

import com.sumit.bankLab.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    Customer createCustomer(Customer customer);
    List<Customer> getAllCustomer();
    Customer getCustomerById(Long customerId);
    Customer updateCustomer(Customer customer, Long customerId);
}
