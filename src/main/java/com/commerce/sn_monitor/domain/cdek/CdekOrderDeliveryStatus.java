package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderDeliveryStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekOrderDeliveryStatus
{
    @JsonProperty("Code")
    private String code;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Date_time")
    private String dateTime;

    @JsonProperty("Reason_code")
    private String reasonCode;

    @JsonProperty("City")
    private String city;
}
