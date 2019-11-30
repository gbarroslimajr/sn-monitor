package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;

public class CdekOrderDelivery
{
    private String deliveryId;
    private String deliveryAddress;
    private String deliveryStartDate;
    private String deliveryEndDate;
    private String contactPhone;
    private String contactInfo;
    private List<CdekOrderItem> orderItems;
}
