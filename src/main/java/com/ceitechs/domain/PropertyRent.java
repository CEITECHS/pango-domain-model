package com.ceitechs.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PropertyRent {
    private double amount;
    private String currency;
    private String rentalPeriod;
}

