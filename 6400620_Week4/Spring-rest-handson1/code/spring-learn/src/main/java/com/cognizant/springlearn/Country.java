package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
    private String code;
    private String name;

    public Country() {
        LOGGER.debug("Country constructor called");
    }

    public String getCode() {
        LOGGER.debug("getCode called: {}", code);
        return code;
    }

    public void setCode(String code) {
        LOGGER.debug("setCode called: {}", code);
        this.code = code;
    }

    public String getName() {
        LOGGER.debug("getName called: {}", name);
        return name;
    }

    public void setName(String name) {
        LOGGER.debug("setName called: {}", name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
