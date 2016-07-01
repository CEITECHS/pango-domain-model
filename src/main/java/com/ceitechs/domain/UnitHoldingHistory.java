package com.ceitechs.domain;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UnitHoldingHistory {
    private long holdingReferenceId;
    private PropertyUnit propertyUnit;
    private Customer customer;
    private LocalDate startDate;
    private LocalDate endDate;
    private CustomerTransactionHistory transactionHistory;
    private PendingPayment holdingPayment;
}

