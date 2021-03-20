package com.example.cloud.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  private Long id;
  private String username;
  private String name;
  private Integer age;
  private BigDecimal balance;
}