package com.hcl.demo.dto;


import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Builder;
import lombok.Data;

@JsonTypeInfo(include= JsonTypeInfo.As.WRAPPER_OBJECT, use= JsonTypeInfo.Id.NAME)
@Data               // Getters Setters
@Builder            // Builder Pattern
@JsonRootName("user")
public class User {
    private String name;
    private Integer age;
}
