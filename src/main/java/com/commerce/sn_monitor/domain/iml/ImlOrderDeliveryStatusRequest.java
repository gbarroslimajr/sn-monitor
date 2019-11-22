package com.commerce.sn_monitor.domain.iml;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ImlOrderDeliveryStatusRequest
{

    @JsonProperty("Test")
    private String test = "True";

    @JsonProperty("Job")
    private String job;

    @JsonProperty("CustomerOrder")
    private String customerOrder;

    @JsonProperty("DeliveryDateStart")
    private String deliveryDateStart;

    @JsonProperty("DeliveryDateEnd")
    private String deliveryDateEnd;

    @JsonProperty("State")
    private String state;

    @JsonProperty("OrderStatus")
    private String orderStatus;

    @JsonProperty("CreationDateStart")
    private String creationDateStart;

    @JsonProperty("CreationDateEnd")
    private String creationDateEnd;

    @JsonProperty("RegionTo")
    private String regionTo;

    @JsonProperty("RegionFrom")
    private String regionFrom;

    @JsonProperty("BarCode")
    private String barCode;
}
