package com.savetrip.DTO.visit;

import com.savetrip.DTO.country.CountryDTO;
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
    private CountryDTO country;

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

}
