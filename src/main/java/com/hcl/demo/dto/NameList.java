package com.hcl.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class NameList {
    @NonNull
    private String id;
    @JsonProperty
    private List<Name> names;
}
