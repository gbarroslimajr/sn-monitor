package com.commerce.sn_monitor.domain;

import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatus;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ImlOrderDeliveryStatus.class, name = "ImlOrderDeliveryStatus")
})
public interface OrderDeliveryStatus
{
    String getDeliveryId();
    String getOrderState();
    String getOrderStatus();
    String getOrderStateDescription();
    String getOrderStatusDescription();
    String getOrderStatusDate();
    String getRefundState();

    void setDeliveryId(String id);
    void setOrderState(String orderState);
    void setOrderStatus(String orderStatus);
    void setOrderStateDescription(String orderStateDescription);
    void setOrderStatusDescription(String orderStatusDescription);
    void setOrderStatusDate(String orderStatusDate);
    void setRefundState(String refundState);
}
