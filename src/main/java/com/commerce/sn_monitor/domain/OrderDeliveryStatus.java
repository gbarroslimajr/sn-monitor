package com.commerce.sn_monitor.domain;

import java.util.Date;

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
