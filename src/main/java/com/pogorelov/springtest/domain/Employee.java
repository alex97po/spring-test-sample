package com.pogorelov.springtest.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Employee {

    private Long id;
    private String name;
    private BigDecimal salary;
}
