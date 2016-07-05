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
public class CustomerPreference {

    public enum PreferenceType {
        Notification;
    }

    private long preferenceId;
    private Customer customer;
    private PreferenceType preferenceType;
    private String notifyOnQuery;
    public LocalDate fromDate;
    public LocalDate toDate;
    private CustomerTransactionHistory customerTransactionHistory; // For renewal payments , recreate the new one and deactivate the old one.
    private boolean active;
    private boolean paid;
    private boolean expired;
    private boolean sendNotification;
}
