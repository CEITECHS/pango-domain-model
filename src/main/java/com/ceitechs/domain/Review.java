package com.ceitechs.domain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Review {
    private Customer customer;
    private PropertyUnit propertyUnit;
    private long reviewId;
    private String reviewText;
    private double rating;
    private String reviewedBy;
    private LocalDate createdDate;
    private boolean recommend;
}
