package com.hcl.demo.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum OrderStatus {
    CANCELLED("CANCELLED"),
    DELIVERED("DELIVERED"),
    INTRANSIT("INTRANSIT"),
    PAYMENTDUE("PAYMENTDUE"),
    PROCESSED("PROCESSED"),
    RETURNED("RETURNED");

    @Getter
    private String value;
}
