package com.ceitechs.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class PropertyListing {
   public enum VerificationStatus {
        Pending,
        InProgress,
        Accepted,
        Rejected
    }

    private String propertyId;
    private Coordinator ownerDetail;
    private LocalDate createdDate;
    private LocalDate verifiedOn;
    private Coordinator verifiedBy;
    private VerificationStatus status;
    private String verificationNotes;


    private String propertyDesc;
    List<String> additionalFeatures;
    private String category;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private double[] location;
    private List<Picture> propertyImages;

    private List<PropertyUnit> propertyUnits;
}
