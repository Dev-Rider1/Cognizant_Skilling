package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.cognizant.springlearn.Country;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		SpringLearnApplication app = new SpringLearnApplication();
		app.displayDate();
		app.displayCountry();
		app.demonstrateSingletonScope();
		app.displayCountryList();
	}

    public void displayDate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
        try {
            Date date = format.parse("31/12/2018");
            LOGGER.debug("Parsed Date: {}", date);
        } catch (ParseException e) {
            LOGGER.error("ParseException occurred", e);
        }
    }

    public void displayCountry() {
        LOGGER.info("START displayCountry");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        LOGGER.debug("Country: {}", country.toString());
        LOGGER.info("END displayCountry");
    }

    public void demonstrateSingletonScope() {
        LOGGER.info("START demonstrateSingletonScope");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country c1 = context.getBean("country", Country.class);
        Country c2 = context.getBean("country", Country.class);
        LOGGER.debug("Country 1: {}", c1);
        LOGGER.debug("Country 2: {}", c2);
        LOGGER.info("END demonstrateSingletonScope");
    }

    public void displayCountryList() {
        LOGGER.info("START displayCountryList");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> list = context.getBean("countryList", List.class);
        for (Country c : list) {
            LOGGER.debug("Country: {}", c);
        }
        LOGGER.info("END displayCountryList");
    }

}