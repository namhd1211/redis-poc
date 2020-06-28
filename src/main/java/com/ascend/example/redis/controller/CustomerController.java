package com.ascend.example.redis.controller;

import com.ascend.example.redis.domain.Customer;
import com.ascend.example.redis.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers")
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {
        log.info("save customer with [{}]", customer);
        return new ResponseEntity<>(customerService.save(customer), HttpStatus.OK);
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> listAll() {
        log.info("Start get all customer");
        List<Customer> result = new ArrayList<>();
        customerService.findAll().forEach(result::add);
        log.info("customer list response : {}", result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


}
