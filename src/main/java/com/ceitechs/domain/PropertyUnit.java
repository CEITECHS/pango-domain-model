package com.ceitechs.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PropertyUnit {
    private long propertyId;
    private long propertyUnidId;
    private long ownerId;
    private String propertyUnitDesc;
    private String propertySize;
    private String propertyType;
    private String propertyTerms;
    private double propertyRent;
    private Date nextAvailableDate;
    private boolean autoListInd;
    private double[] location;
    private double rating;
}

