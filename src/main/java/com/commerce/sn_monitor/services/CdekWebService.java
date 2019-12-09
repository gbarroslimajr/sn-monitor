package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.configs.CdekApiConfig;
import com.commerce.sn_monitor.domain.OrderDeliveryRequest;
import com.commerce.sn_monitor.domain.OrderDeliveryStatusRequest;
import com.commerce.sn_monitor.domain.cdek.CdekOrderDelivery;
import com.commerce.sn_monitor.domain.cdek.CdekOrderDeliveryStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CdekWebService
{
    private CdekApiConfig conf;
    private RestTemplate rest;

    public CdekWebService(CdekApiConfig conf, RestTemplate rest)
    {
        this.conf = conf;
        this.rest = rest;
    }

    public CdekOrderDelivery makeDeliveryRequest(OrderDeliveryRequest order)
    {
        return null;
    }

    public List<CdekOrderDeliveryStatus> getOrdersStatus(OrderDeliveryStatusRequest statusRequest)
    {
        return null;
    }
}
