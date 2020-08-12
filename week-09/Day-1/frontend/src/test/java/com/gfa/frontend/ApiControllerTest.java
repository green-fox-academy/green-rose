package com.gfa.frontend;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.core.Is.is;

@SpringBootTest
@AutoConfigureMockMvc
public class ApiControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype());

    @Autowired
    MockMvc mockMvc;

    @Test
    void shouldReturnWarningNoInput() throws Exception {
        this.mockMvc.perform(get("/doubling?input=5")
                .contentType(contentType)
                .content("{\"until\": \"8\"}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(10)));
        //this.mockMvc.perform(get("/doubling")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("Please provide an input!")));
    }


    @Test
    void shouldReturnWarningNotInt() throws Exception {
        this.mockMvc.perform(get("/doubling?input=5")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("{\"received\":5,\"result\":10}")));
    }
}
