package com.inditex.priceapi.infraestructure.adapters.input.api.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@SpringBootTest
@AutoConfigureMockMvc
class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test1() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/price")
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("product_id", "35455")
                        .param("brand_id", "1")
                        .param("application_date", "2020-06-14T10:00:00"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().json(
                        "{" +
                                "\"product_id\": \"35455\"," +
                                "\"brand_id\": 1," +
                                "\"price_list\": \"1\"," +
                                "\"start_date\": \"2020-06-14T00:00:00\"," +
                                "\"end_date\": \"2020-12-31T23:59:59\"" +
                                "}"
                ));
    }

    @Test
    public void test2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/price")
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("product_id", "35455")
                        .param("brand_id", "1")
                        .param("application_date", "2020-06-14T16:00:00"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().json(
                        "{" +
                                "\"product_id\": \"35455\"," +
                                "\"brand_id\": 1," +
                                "\"price_list\": \"2\"," +
                                "\"start_date\": \"2020-06-14T15:00:00\"," +
                                "\"end_date\": \"2020-06-14T18:30:00\"" +
                                "}"
                ));
    }

    @Test
    public void test3() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/price")
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("product_id", "35455")
                        .param("brand_id", "1")
                        .param("application_date", "2020-06-14T21:00:00"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().json(
                        "{" +
                                "\"product_id\": \"35455\"," +
                                "\"brand_id\": 1," +
                                "\"price_list\": \"1\"," +
                                "\"start_date\": \"2020-06-14T00:00:00\"," +
                                "\"end_date\": \"2020-12-31T23:59:59\"" +
                                "}"
                ));
    }

    @Test
    public void test4() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/price")
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("product_id", "35455")
                        .param("brand_id", "1")
                        .param("application_date", "2020-06-15T10:00:00"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().json(
                        "{" +
                                "\"product_id\": \"35455\"," +
                                "\"brand_id\": 1," +
                                "\"price_list\": \"3\"," +
                                "\"start_date\": \"2020-06-15T00:00:00\"," +
                                "\"end_date\": \"2020-06-15T11:00:00\"" +
                                "}"
                ));
    }

    @Test
    public void test5() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/price")
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("product_id", "35455")
                        .param("brand_id", "1")
                        .param("application_date", "2020-06-16T21:00:00"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().json(
                        "{" +
                                "\"product_id\": \"35455\"," +
                                "\"brand_id\": 1," +
                                "\"price_list\": \"4\"," +
                                "\"start_date\": \"2020-06-15T16:00:00\"," +
                                "\"end_date\": \"2020-12-31T23:59:59\"" +
                                "}"
                ));
    }

    // Este test comprobará que si la respuesta está vacía, devolverá un HttpStatus.No_Content
    @Test
    public void test6_NO_CONTENT() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/price")
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("product_id", "35455")
                        .param("brand_id", "2")
                        .param("application_date", "2020-06-16T21:00:00"))
                .andExpect(MockMvcResultMatchers.status().isNoContent());
    }
}