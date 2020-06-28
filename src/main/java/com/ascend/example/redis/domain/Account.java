package com.ascend.example.redis.domain;

import lombok.*;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private Long id;
    private String number;
    private int balance;
}
