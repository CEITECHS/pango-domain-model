package com.ceitechs.domain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerTransactionHistory {

    public enum TransactionStatus {
        PENDING,
        PROCESSED,
        SUCCESS,
        FAILED,
        CANCELLED
    }

    private String transactionId;
    private Customer customer;
    // private UnitRentalHistory rentalHistory;
    private UnitHoldingHistory holdingHistory;
    private TransactionType transactionType;
    private String paymentReferenceId;
    private String payingAccount;
    private String transactionDesc;
    private String statusReason;
    private double transactionAmount;
    private LocalDate transactionDate;
}