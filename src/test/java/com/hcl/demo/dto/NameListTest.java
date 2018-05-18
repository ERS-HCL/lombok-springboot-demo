package com.hcl.demo.dto;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class NameListTest {

    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void should_deserialize() throws IOException {
        /* GIVEN */
        String nameListInJson = "{ \"id\": \"1\", \"names\": [{\"locale\":\"someLocale\",\"name\":\"someName\",\"primary\":true},{\"locale\":\"someLocale2\",\"name\":\"someName2\",\"primary\":false}]}";
        /* WHEN  */
        NameList nameList = mapper.readValue(nameListInJson, NameList.class);
        /* THEN  */
        assertThat("someName",is(equalTo(nameList.getNames().get(0).getName())));
    }

    @Test (expected = JsonMappingException.class)
    public void should_throw_exception_on_notnull_field() throws IOException {
        /* GIVEN */
        String nameListInJson = "{ \"names\": [{\"locale\":\"someLocale\",\"name\":\"someName\",\"primary\":true},{\"locale\":\"someLocale2\",\"name\":\"someName2\",\"primary\":false}]}";
        /* WHEN  */
        NameList nameList = mapper.readValue(nameListInJson, NameList.class);
    }

}