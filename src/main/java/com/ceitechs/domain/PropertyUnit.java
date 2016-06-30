package com.ceitechs.domain;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PropertyUnit {
    private long propertyUnidId;
    private String propertyUnitDesc;
    private String propertyType;
    private String propertyTerms;
    private LocalDate nextAvailableDate;
    private boolean autoListInd;
    private double[] location;
    private double propertyRating;
    private List<Review> reviews;
    private Customer owner;
    private Property property;
    private PropertyFeature features;
    private PropertyRent rent;
    private List<Picture> propertyUnitImages;
    private List<PropertyUnitHistory> history;
    private List<PropertyUnitInquiry> enquiries;
}

