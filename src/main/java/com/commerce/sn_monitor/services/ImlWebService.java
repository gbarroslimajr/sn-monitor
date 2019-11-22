package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryRequest;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryResponse;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatus;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatusRequest;
import org.springframework.stereotype.Service;

@Service
public class ImlWebService implements OrderDeliveryProcessingService
{
    @Override
    public ImlOrderDeliveryResponse makeDeliveryRequest(ImlOrderDeliveryRequest order)
    {
        return null;
    }

    @Override
    public ImlOrderDeliveryStatus getDeliveryStatus(ImlOrderDeliveryStatusRequest statusRequest)
    {
        return null;
    }
}
