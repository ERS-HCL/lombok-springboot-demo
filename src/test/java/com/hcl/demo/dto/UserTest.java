package com.hcl.demo.dto;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static net.javacrumbs.jsonunit.JsonAssert.assertJsonEquals;

public class UserTest {

    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void should_serialize() throws JsonProcessingException {
        User user = User.builder()
                .name("Dave")
                .age(50)
                .build();
        String jsonString = mapper.writeValueAsString(user);
        assertJsonEquals("{\"User\":{\"name\":\"Dave\",\"age\":50}}",jsonString);
    }
}