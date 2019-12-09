package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderDeliveryStatus;
import lombok.Data;

@Data
public class CdekOrderDeliveryStatus
{
    @JsonProperty("Code")
    private String code;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Date_time")
    private String date_time;

    @JsonProperty("Reason_code")
    private String reason_code;

    @JsonProperty("City")
    private String city;
}
