package com.savetrip.service.country;

import com.savetrip.DAO.country.CountryDAO;
import com.savetrip.DTO.country.CountryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    CountryDAO countryDAO;

    public List<CountryDTO> countryList(){return countryDAO.countryList();}
}
