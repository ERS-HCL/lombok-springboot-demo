package com.hcl.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

// Demonstrates Immutable DTO objects
@Value
@Builder
public class Name {
    @JsonProperty
    private String locale;
    @JsonProperty
    private String name;
    @JsonProperty
    private boolean primary;
}
