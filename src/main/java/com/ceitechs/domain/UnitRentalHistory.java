package com.ceitechs.domain;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UnitRentalHistory {
    private long rentalReferenceId;
    private PropertyUnit propertyUnit;
    private Customer customer;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<CustomerTransactionHistory> transactionHistory;
    private List<PendingPayment> pendingPayments;
    private boolean isActive;
}
