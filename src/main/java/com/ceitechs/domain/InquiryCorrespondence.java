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
public class InquiryCorrespondence {
    private String subject;
    private String message;
    private Picture attachment;
    private LocalDate correspondenceDate;
    private CorrespondenceType correspondenceType;
    private boolean owner;
}
