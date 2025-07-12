package com.cognizant.springlearn;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.cognizant.springlearn.controller.CountryController;

@SpringBootTest
@AutoConfigureMockMvc
class SpringLearnApplicationTests {

    @Autowired
    private CountryController countryController;

    @Autowired
    private MockMvc mvc;

    @Test
    void contextLoads() {
        assertNotNull(countryController);           // controller present
    }

    @Test
    void testGetCountry() throws Exception {
        ResultActions actions = mvc.perform(get("/country"));
        actions.andExpect(status().isOk())
               .andExpect(jsonPath("$.code").value("IN"))
               .andExpect(jsonPath("$.name").value("India"));
    }

    @Test
    void testGetCountryException() throws Exception {
        mvc.perform(get("/countries/zz"))
           .andExpect(status().isNotFound())
           .andExpect(status().reason("Country not found"));
    }
}
