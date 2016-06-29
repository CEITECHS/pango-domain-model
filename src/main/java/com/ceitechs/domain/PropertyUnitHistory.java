package com.ceitechs.domain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PropertyUnitHistory {
    private PropertyUnit propertyUnit;
    private Customer customer;
    private LocalDate startDate;
    private LocalDate endDate;
    private CustomerTransactionHistory transactionHistory;
}
