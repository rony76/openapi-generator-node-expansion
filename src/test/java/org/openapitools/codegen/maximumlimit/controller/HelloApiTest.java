package org.openapitools.codegen.maximumlimit.controller;

import org.junit.jupiter.api.Test;
import org.openapitools.codegen.maximumlimit.api.HelloApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloApi.class)
class HelloApiTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReceiveGreetingsWithValidLimit() throws Exception {
        mockMvc.perform(get("/hello").param("limit", "5"))
                .andExpect(status().isOk());
    }

    @Test
    void shouldComplainForInvalidLimit() throws Exception {
        mockMvc.perform(get("/hello").param("limit", "25"))
                .andExpect(status().isBadRequest());
    }
}