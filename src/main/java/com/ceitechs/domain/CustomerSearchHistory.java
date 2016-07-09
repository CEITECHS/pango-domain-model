package com.ceitechs.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * @author iddymagohe
 * @since 0.1
 */

@Getter
@Setter
public class CustomerSearchHistory {
    private LocalDate date;
    private String query;
    private CustomerPreference customerPreference;
}
