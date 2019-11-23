package com.commerce.sn_monitor.domain;

import java.util.Date;

public interface OrderDeliveryStatus
{
    String getDeliveryId();
    Date getDeliveryStartDate();
    Date getDeliveryEndDate();
    String getOrderState();
    String getOrderStatus();
    String getDeliveryRegion();
}
