package com.ceitechs.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Review {
    private long customerId;
    private long propertyUnitId;
    private long reviewId;
    private String reviewText;
    private double rating;
    private String reviewedBy;
    private Date createdDate;
}
