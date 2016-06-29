package com.ceitechs.domain;


import java.time.LocalDate;
import java.util.List;

/**
 * @author iddymagohe
 * @since 0.1
 */
public class InquiryCorrespondence {
    private String subject;
    private String message;
    private Picture attachment;
    private LocalDate correspondenceDate;
    private CorrespondenceType correspondenceType;
    private boolean owner;
}
