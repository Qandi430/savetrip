package com.savetrip.DTO.visit;

import lombok.Data;

import java.sql.Date;

@Data
public class VisitDTO {
    private int visitNo;
    private int userNo;
    private char ccode;
    private String visitTitle;
    private Date visitSDate;
    private Date visitEDate;
    private CoverDTO coverDTO;
}
