package com.ascend.example.redis.domain;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@RedisHash("customer")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private Long id;
    private String name;
    private List<Account> accounts = new ArrayList<>();
}
