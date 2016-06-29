package com.ceitechs.domain;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

/**
 * @author iddymagohe
 * @since 0.1
 */

@Getter
@Setter
public class PropertyUnitInquiry {
    private String correspondenceId;
    private Customer customer;
    private PropertyUnit propertyUnit;
    private String subject;
    private String message;
    private LocalDate inquiryDate;
    private CorrespondenceType inquiryType;
    List<InquiryCorrespondence> correspondences;
}
