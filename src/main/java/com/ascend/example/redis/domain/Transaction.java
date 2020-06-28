package com.ascend.example.redis.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.time.LocalDate;

@RedisHash("transaction")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    private Long id;
    private int amount;
    private LocalDate date;
    @Indexed
    private Long fromAccountId;
    @Indexed
    private Long toAccountId;
}
