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
public class CustomerPreference {
    private long preferanceId;
    private Customer customer;
    private String preferenceType;
    private boolean sendNotification;
}
