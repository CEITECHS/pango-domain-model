package com.ceitechs.domain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PendingPayment {
    private LocalDate startDate;
    private LocalDate endDate;
    private double paymentAmount;
    private boolean paidFlag;
    private String paymentPeriod;
}


