package com.savetrip.DTO.country;

import lombok.Data;

@Data
public class CountryDTO {
    private String ccode;
    private String kor;
    private String eng;
    private double exchange;
    private String unit;

    public String getCcode(){
        return ccode.toLowerCase();
    }

}
