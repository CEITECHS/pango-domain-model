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
public class CustomerSearchHistory {
    private LocalDate date;
    private String query;
}
