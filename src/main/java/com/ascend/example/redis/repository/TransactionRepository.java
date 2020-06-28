package com.ascend.example.redis.repository;

import com.ascend.example.redis.domain.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
    List findByFromAccountId(Long fromAccountId);

    List findByToAccountId(Long toAccountId);
}
