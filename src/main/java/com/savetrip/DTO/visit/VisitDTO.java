package com.savetrip.DTO.visit;

import lombok.Data;

import java.sql.Date;
import java.text.SimpleDateFormat;

@Data
public class VisitDTO {
    private int visitNo;
    private int userNo;
    private String ccode;
    private String visitTitle;
    private Date visitSDate;
    private Date visitEDate;
    private CoverDTO coverDTO;

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

    public String getVisitSDate() {
        return sdf.format(visitSDate);
    }

    public String getVisitEDate() {
        return sdf.format(visitEDate);
    }

    public String getCcode(){
        return ccode.toLowerCase();
    }
}
