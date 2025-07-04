package com.cognizant.orm_learn;

//import java.util.List;

import com.cognizant.orm_learn.model.*;
import com.cognizant.orm_learn.service.*;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static countryService ctryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        LOGGER.info("Inside main");

        ctryService = context.getBean(countryService.class);
        testAddCountry();
        //testGetAllCountries();
        
        //getCountryTest();
    }
    
    private static void testAddCountry()
    {
    	LOGGER.info("Start");
    	
    	Country newCountry=new Country();
    	newCountry.setCode("XX");
    	newCountry.setName("Country XYZ");
    	
    	ctryService.addCountry(newCountry);
    	getCountryTest();
    }
/**
    private static void testGetAllCountries() {
        LOGGER.info("Start");
        List<Country> countries = ctryService.getAllCountries();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End");
    }
*/    
    private static void getCountryTest() {
    	
    	//First Search
        LOGGER.info("Start");
        try {
            Country country = ctryService.findCountryByCode("XX");
            LOGGER.debug("Country: {}", country);
        } catch (CountryNotFoundException e) {
            LOGGER.error("Exception: {}", e.getMessage());
        }
        LOGGER.info("End");
    }
    
}