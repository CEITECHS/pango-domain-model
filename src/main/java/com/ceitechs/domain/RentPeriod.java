package com.ceitechs.domain;

/**
 * Created by iddymagohe on 7/2/16.
 */
public enum RentPeriod {
    MONTHLY("mo"),
    YEARLY("yr");

    private String value;

    RentPeriod(String value) {
        this.value = value;
    }
}
