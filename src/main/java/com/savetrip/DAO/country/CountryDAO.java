package com.savetrip.DAO.country;

import com.savetrip.DTO.country.CountryDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CountryDAO {
    public List<CountryDTO> countryList();
}
