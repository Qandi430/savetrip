package com.savetrip.controller.country;

import com.savetrip.DTO.country.CountryDTO;
import com.savetrip.service.country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    CountryService countryService;

    @RequestMapping("/countryList")
    @ResponseBody
    public List<CountryDTO> countryList(){
        return countryService.countryList();
    }
}
