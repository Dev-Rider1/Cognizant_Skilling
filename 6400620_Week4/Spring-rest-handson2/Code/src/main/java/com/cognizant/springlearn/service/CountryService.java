package com.cognizant.springlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

    @Autowired
    @Qualifier("countryList")          // references bean id from XML
    private List<Country> countryList;

    public Country getCountry(String code) throws CountryNotFoundException {
        return countryList.stream()
                          .filter(c -> c.getCode().equalsIgnoreCase(code))
                          .findFirst()
                          .orElseThrow(() -> new CountryNotFoundException("Country not found"));
    }

    public List<Country> getAll() {
        return countryList;
    }
}
