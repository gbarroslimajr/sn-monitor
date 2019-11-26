package com.commerce.sn_monitor.domain.iml;

import com.commerce.sn_monitor.domain.OrderDeliveryStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Setter;

@Data
public class ImlOrderDeliveryStatus implements OrderDeliveryStatus
{

    @JsonProperty("Number")
    private String deliveryId;

    @JsonProperty("State")
    private String orderState;

    @JsonProperty("OrderStatus")
    private String orderStatus;

    @JsonProperty("StateDescription")
    private String orderStateDescription;

    @JsonProperty("OrderStatusDescription")
    private String orderStatusDescription;

    @JsonProperty("StatusDate")
    private String orderStatusDate;

    @JsonProperty("ReturnPayment")
    private String refundState;
}
