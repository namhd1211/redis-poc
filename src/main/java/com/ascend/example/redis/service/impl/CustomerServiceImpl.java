package com.ascend.example.redis.service.impl;

import com.ascend.example.redis.domain.Customer;
import com.ascend.example.redis.repository.CustomerRepository;
import com.ascend.example.redis.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findByExternalId(String externalId) {
        return customerRepository.findByExternalId(externalId);
    }

    @Override
    public List<Customer> findByAccountsId(Long id) {
        return customerRepository.findByAccountsId(id);
    }

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

}
