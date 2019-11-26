package com.commerce.sn_monitor.domain;

import java.util.List;

public interface OrderDelivery
{
    List<OrderItem> getOrderItems();

    void setOrderItems(List<OrderItem> orderItems);
}
