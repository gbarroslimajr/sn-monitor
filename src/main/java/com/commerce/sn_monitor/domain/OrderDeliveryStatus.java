package com.commerce.sn_monitor.domain;

import java.util.Date;

public interface OrderDeliveryStatus
{
    String deliveryId();
    Date deliveryStartDate();
    Date deliveryEndDate();
    String orderState();
    String orderStatus();
    String deliveryRegion();
}
