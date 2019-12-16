package com.commerce.sn_monitor.domain.cdek;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekOrderDeliveryStatusRequest
{
    @JsonProperty("uuid")
    private String orderId;
}
