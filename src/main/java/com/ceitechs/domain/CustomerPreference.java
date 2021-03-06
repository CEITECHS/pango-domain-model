package com.ceitechs.domain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

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
    
    public enum PreferenceCategory {
        SEARCH;
    }

    private long preferenceId;
    private PreferenceType preferenceType;
    private LocalDate fromDate;
    private LocalDate toDate;
    private boolean active;
    private boolean sendNotification;
    private PreferenceCategory category;
    private CustomerSearchHistory customerSearchHistory;
}
