package com.commerce.sn_monitor.domain.iml;

import com.commerce.sn_monitor.domain.OrderDeliveryStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ImlOrderDeliveryStatusRequest implements OrderDeliveryStatus
{

    @JsonProperty("Test")
    private String test = "True";

    @JsonProperty("Job")
    private String job;

    @JsonProperty("CustomerOrder")
    private String deliveryId;

    @JsonProperty("DeliveryDateStart")
    private String deliveryStartDate;

    @JsonProperty("DeliveryDateEnd")
    private String deliveryEndDate;

    @JsonProperty("State")
    private String orderState;

    @JsonProperty("OrderStatus")
    private String orderStatus;

    @JsonProperty("CreationDateStart")
    private String creationDateStart;

    @JsonProperty("CreationDateEnd")
    private String creationDateEnd;

    @JsonProperty("RegionTo")
    private String deliveryRegion;

    @JsonProperty("RegionFrom")
    private String regionFrom;

    @JsonProperty("BarCode")
    private String barCode;
}
