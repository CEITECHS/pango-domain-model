package com.ceitechs.domain;


import lombok.Getter;
import lombok.Setter;

/**
 * @author iddymagohe
 * @since 0.1
 */

@Getter
@Setter
public class CustomerPaymentProfile {
    private String paymentProfileId;
    private Customer customer;
    private String accountName;
    private String routingNumber;
    private String accountNumber;
    private boolean defaultPaymentProfile;
    private String accountType;
}
