package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.configs.CdekApiConfig;
import com.commerce.sn_monitor.domain.OrderDeliveryRequest;
import com.commerce.sn_monitor.domain.OrderDeliveryStatusRequest;
import com.commerce.sn_monitor.domain.cdek.CdekAuthToken;
import com.commerce.sn_monitor.domain.cdek.CdekOrderDelivery;
import com.commerce.sn_monitor.domain.cdek.CdekOrderDeliveryStatus;
import com.commerce.sn_monitor.domain.cdek.CdekOrderDeliveryStatusRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

import java.util.HashMap;
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

    public CdekOrderDelivery makeDeliveryRequest(CdekOrderDelivery order)
    {
        return null;
    }

    public CdekOrderDelivery getOrdersStatus(CdekOrderDeliveryStatusRequest statusRequest)
    {
        String statusEndpoint = conf.ENDPOINT + "/orders/{uuid}";

        HttpHeaders headers = getRequiredHeaders();
        HttpEntity requestEntity = new HttpEntity(headers);

        ResponseEntity info = rest.exchange(
                statusEndpoint,
                HttpMethod.GET,
                requestEntity,
                CdekOrderDelivery.class,
                statusRequest.getOrderId()
        );

        return (CdekOrderDelivery) info.getBody();
    }

    private HttpHeaders getRequiredHeaders()
    {
        CdekAuthToken token = getAuthToken();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer" + token.getAccessToken());

        return headers;
    }

    // yeah I know that noone works with oauth2 this way yet I literally have no time to figure out the correct way
    private CdekAuthToken getAuthToken()
    {
        String authEndpoint = conf.ENDPOINT + "/oauth/token?grant_type={grant_type}&client_id={client_id}&client_secret={client_secret}";

        HttpHeaders defaultHeaders = new HttpHeaders();
        HttpEntity req = new HttpEntity(defaultHeaders);

        return rest.postForObject(authEndpoint, req, CdekAuthToken.class, conf.getAuthData());
    }
}
