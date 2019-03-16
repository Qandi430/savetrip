package com.savetrip.DTO.country;

import lombok.Data;

@Data
public class CountryDTO {
    private char ccode;
    private String kor;
    private String eng;
    private double exchange;
    private String unit;
}
