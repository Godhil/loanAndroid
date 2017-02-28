package com.example.denis.app.models;

import java.math.BigDecimal;

public class Product {

    private Long id;
    private String name;
    private BigDecimal minAmount;
    private BigDecimal maxAmount;
    private Integer minTerm;
    private Integer maxTerm;
    private BigDecimal ratePerDay;
    private BigDecimal penPerDay;
    private Status status;

    private enum Status { Active, NoActive;}
}
