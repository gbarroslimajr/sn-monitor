package com.commerce.sn_monitor.domain;

import java.util.List;

public interface OrderDelivery
{
    String getDeliveryId();
    String getDeliveryAddress();
    String getDeliveryStartDate();
    String getDeliveryEndDate();
    String getContactPhone();
    String getContactInfo();
    List<OrderItem> getOrderItems();

    void setDeliveryId();
    void setDeliveryAddress();
    void setDeliveryStartDate();
    void setDeliveryEndDate();
    void setContactPhone();
    void setContactInfo();
    void setOrderItems(List<OrderItem> orderItems);
}
