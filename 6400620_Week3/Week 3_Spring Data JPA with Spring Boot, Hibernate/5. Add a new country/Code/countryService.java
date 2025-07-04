package com.cognizant.orm_learn.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.model.*;
import com.cognizant.orm_learn.repository.*;
import com.cognizant.spring_learn.service.exception.*;

@Service
public class countryService {

    @Autowired
    private CountryRepository countryRepository;
/**
    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
 */   
    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException
    {
    	Optional<Country> result = countryRepository.findById(countryCode);
    	if (!result.isPresent())
    		throw new CountryNotFoundException("Country code is invalid..."+countryCode);
    	
    	Country country = result.get();
    	return country;
    }
    
    @Transactional
    public void addCountry(Country country)
    {
    	countryRepository.save(country);
    }
}