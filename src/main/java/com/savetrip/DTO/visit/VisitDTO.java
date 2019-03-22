package com.savetrip.DTO.visit;

import com.savetrip.DTO.country.CountryDTO;
import lombok.Data;

@Data
public class VisitDTO {
    private int visitNo;
    private int userNo;
    private String ccode;
    private String visitTitle;
    private String visitSDate;
    private String visitEDate;
    private CoverDTO coverDTO;
    private CountryDTO country;
    private String visitContent;
}
