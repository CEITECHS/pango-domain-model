package com.ceitechs.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author iddymagohe
 * @since 0.1
 */

@Getter
@Setter
public class Customer {
    private long customerId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String addressLine1;
    private String addressLine2;
    private String City;
    private String State;
    private String zip;
    private String country;
    private CustomerProfile profile;
    private List<CustomerPreference> preferences;
}
