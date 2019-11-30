package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.configs.ImlApiConfig;
import com.commerce.sn_monitor.domain.OrderDelivery;
import com.commerce.sn_monitor.domain.OrderDeliveryRequest;
import com.commerce.sn_monitor.domain.OrderDeliveryStatus;
import com.commerce.sn_monitor.domain.OrderDeliveryStatusRequest;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatusRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@Service
public class ImlWebService implements OrderDeliveryProcessingService
{

    private RestTemplate rest;
    private ImlApiConfig conf;

    public ImlWebService(RestTemplate rest, ImlApiConfig conf)
    {
        this.rest = rest;
        this.conf = conf;
    }

    @Override
    public OrderDelivery makeDeliveryRequest(OrderDeliveryRequest order)
    {

        return null;
    }

    @Override
    public List<OrderDeliveryStatus> getOrdersStatus(OrderDeliveryStatusRequest statusRequest)
    {
        String statusEndpoint = conf.ENDPOINT + "/GetStatuses";
        ImlOrderDeliveryStatusRequest req = (ImlOrderDeliveryStatusRequest) statusRequest;
        HttpHeaders headers = getRequiredHeaders();
        log.debug(req.getTest());

        return null;
    }

    private HttpHeaders getRequiredHeaders()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Basic " + conf.getBase64EncodedCredentials());
        return headers;
    }
}
