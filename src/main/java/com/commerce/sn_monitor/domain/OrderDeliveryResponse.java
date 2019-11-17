package com.commerce.sn_monitor.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;

@Data
public class OrderDeliveryResponse
{
    @JsonProperty("Result")
    private String result;

    @JsonProperty("Order")
    private OrderDeliveryRequest order;

    @JsonProperty("Errors")
    private HashMap<String, String> errors;
}
