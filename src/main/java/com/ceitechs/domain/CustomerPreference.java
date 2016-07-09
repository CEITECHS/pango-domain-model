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

    private long preferenceId;
    private PreferenceType preferenceType;
    public LocalDate fromDate;
    public LocalDate toDate;
    private boolean active;
    private boolean sendNotification;
}
