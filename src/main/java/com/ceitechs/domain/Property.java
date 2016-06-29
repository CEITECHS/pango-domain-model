package com.ceitechs.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Property {
    private long propertyId;
    private String propertyDesc;
    private String features;
    private String category;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private double[] location;
    private double rating;
}
