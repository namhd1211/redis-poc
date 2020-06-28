package com.ascend.example.redis.service;

import com.ascend.example.redis.domain.Customer;

import java.util.Iterator;
import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);
    Customer findByExternalId(String externalId);
    List<Customer> findByAccountsId(Long id);

    Iterable<Customer> findAll();
}
