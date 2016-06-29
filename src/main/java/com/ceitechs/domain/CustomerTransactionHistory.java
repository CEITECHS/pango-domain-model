package com.ceitechs.domain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerTransactionHistory {
    private Customer customer;
    private PropertyUnit propertyUnit;
    private TransactionType transactionType;
    private String transactionDesc;
    private double transactionAmount;
    private LocalDate transactionDate;
}
