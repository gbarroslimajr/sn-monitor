package com.commerce.sn_monitor.domain.iml;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;

@Data
public class ImlOrderDeliveryResponse
{
    @JsonProperty("Result")
    private String result;

    @JsonProperty("Order")
    private ImlOrderDeliveryRequest order;

    @JsonProperty("Errors")
    private ArrayList<HashMap<String, String>> errors;
}
