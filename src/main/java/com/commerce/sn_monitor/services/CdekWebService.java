package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.configs.CdekApiConfig;
import com.commerce.sn_monitor.domain.OrderDelivery;
import com.commerce.sn_monitor.domain.OrderDeliveryRequest;
import com.commerce.sn_monitor.domain.OrderDeliveryStatus;
import com.commerce.sn_monitor.domain.OrderDeliveryStatusRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CdekWebService implements OrderDeliveryProcessingService
{
    private CdekApiConfig conf;
    private RestTemplate rest;

    public CdekWebService(CdekApiConfig conf, RestTemplate rest)
    {
        this.conf = conf;
        this.rest = rest;
    }

    @Override
    public OrderDelivery makeDeliveryRequest(OrderDeliveryRequest order)
    {
        return null;
    }

    @Override
    public List<OrderDeliveryStatus> getOrdersStatus(OrderDeliveryStatusRequest statusRequest)
    {
        return null;
    }
}
