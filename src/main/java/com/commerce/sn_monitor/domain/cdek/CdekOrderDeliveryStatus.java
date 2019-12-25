package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderDeliveryStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekOrderDeliveryStatus
{
    @JsonProperty("code")
    private String code;

    @JsonProperty("name")
    private String name;

    @JsonProperty("date_time")
    private String dateTime;

    @JsonProperty("reason_code")
    private String reasonCode;

    @JsonProperty("city")
    private String city;
}
