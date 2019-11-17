package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.domain.OrderDeliveryRequest;
import com.commerce.sn_monitor.domain.OrderDeliveryResponse;
import com.commerce.sn_monitor.domain.OrderDeliveryStatus;
import com.commerce.sn_monitor.domain.OrderDeliveryStatusRequest;

public interface OrderDeliveryProcessingService
{
    OrderDeliveryResponse makeDeliveryRequest(OrderDeliveryRequest order);

    OrderDeliveryStatus getDeliveryStatus(OrderDeliveryStatusRequest statusRequest);
}
