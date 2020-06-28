package com.ascend.example.redis.repository;

import com.ascend.example.redis.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findByExternalId(String externalId);

    List<Customer> findByAccountsId(Long id);

    Customer save(Customer customer);
}
