package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.configs.CdekApiConfig;
import com.commerce.sn_monitor.domain.cdek.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

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

    public CdekOrderDelivery makeDeliveryRequest(CdekOrderDeliveryRequest order)
    {
        String orderEndpoint = conf.ENDPOINT + "/orders";

        HttpHeaders headers = getRequiredHeaders();
        HttpEntity requestEntity = new HttpEntity(order, headers);

        ResponseEntity<CdekOrderDelivery> response = rest.postForEntity(
                orderEndpoint,
                requestEntity,
                CdekOrderDelivery.class
        );

        return response.getBody();
    }

    public CdekOrderDelivery getOrdersStatus(CdekOrderDeliveryStatusRequest statusRequest)
    {
        String statusEndpoint = conf.ENDPOINT + "/orders/{uuid}";

        HttpHeaders headers = getRequiredHeaders();
        HttpEntity requestEntity = new HttpEntity(headers);

        ResponseEntity<CdekOrderDelivery> response = rest.exchange(
                statusEndpoint,
                HttpMethod.GET,
                requestEntity,
                CdekOrderDelivery.class,
                statusRequest.getOrderId()
        );

        return response.getBody();
    }

    private HttpHeaders getRequiredHeaders()
    {
        CdekAuthToken token = getAuthToken();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer" + token.getAccessToken());

        return headers;
    }

    // yeah I know that no one works with oauth2 this way yet I literally have no time to figure out the correct way
    private CdekAuthToken getAuthToken()
    {
        String authEndpoint = conf.ENDPOINT + "/oauth/token?grant_type={grant_type}&client_id={client_id}&client_secret={client_secret}";

        HttpHeaders defaultHeaders = new HttpHeaders();
        HttpEntity req = new HttpEntity(defaultHeaders);

        return rest.postForObject(authEndpoint, req, CdekAuthToken.class, conf.getAuthData());
    }
}
