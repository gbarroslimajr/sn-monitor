package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.domain.OrderDeliveryRequest;
import com.commerce.sn_monitor.domain.OrderDeliveryResponse;
import com.commerce.sn_monitor.domain.OrderDeliveryStatus;
import com.commerce.sn_monitor.domain.OrderDeliveryStatusRequest;
import org.springframework.stereotype.Service;

@Service
public class ImlWebService implements OrderDeliveryProcessingService
{
    @Override
    public OrderDeliveryResponse makeDeliveryRequest(OrderDeliveryRequest order)
    {
        return null;
    }

    @Override
    public OrderDeliveryStatus getDeliveryStatus(OrderDeliveryStatusRequest statusRequest)
    {
        return null;
    }
}
