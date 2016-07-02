package com.ceitechs.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Property {
    private long propertyId;
    private String propertyDesc;
    private String category;
    private PURPOSE purpose;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private double[] location;
    private double rating;
    private List<PropertyUnit> propertyUnits;
    private Customer owner;
    private PropertyFeature features;
    private PropertyRent rent;
    private List<Picture> propertyImages;
}
