package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.configs.ImlApiConfig;
import com.commerce.sn_monitor.domain.OrderDelivery;
import com.commerce.sn_monitor.domain.OrderDeliveryRequest;
import com.commerce.sn_monitor.domain.OrderDeliveryStatus;
import com.commerce.sn_monitor.domain.OrderDeliveryStatusRequest;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryRequest;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryResponse;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatus;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatusRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Slf4j
@Service
public class ImlWebService
{

    private RestTemplate rest;
    private ImlApiConfig conf;

    public ImlWebService(RestTemplate rest, ImlApiConfig conf)
    {
        this.rest = rest;
        this.conf = conf;
    }

    public ImlOrderDeliveryResponse makeDeliveryRequest(ImlOrderDeliveryRequest order)
    {
        String orderReqEndpoint = conf.ENDPOINT + "/CreateOrder";

        log.info(order.toString());
        HttpHeaders headers = getRequiredHeaders();
        HttpEntity requestEntity = new HttpEntity(order, headers);

        ImlOrderDeliveryResponse response = rest.postForObject(
            orderReqEndpoint,
            requestEntity,
            ImlOrderDeliveryResponse.class
        );

        if (response == null)
        {
            log.error("No response from " + orderReqEndpoint);
            return new ImlOrderDeliveryResponse();
        }

        return response;
    }

    public List<ImlOrderDeliveryStatus> getImlOrdersStatus(ImlOrderDeliveryStatusRequest statusRequest)
    {
        String statusEndpoint = conf.ENDPOINT + "/GetStatuses";

        HttpHeaders headers = getRequiredHeaders();
        HttpEntity requestEntity = new HttpEntity(statusRequest, headers);

        ImlOrderDeliveryStatus[] response = rest.postForObject(
            statusEndpoint,
            requestEntity,
            ImlOrderDeliveryStatus[].class
        );

        if (response == null)
        {
            log.error("No response from" + statusEndpoint);
            return new ArrayList<>();
        }

        return new ArrayList<>(Arrays.asList(response));
    }

    public List<? extends Map<String, String>> getServicesData()
    {
        String serviceCodesEndpoint = conf.VOC_ENDPOINT + "/service";

        HttpHeaders headers = getRequiredHeaders();
        HttpEntity requestEntity = new HttpEntity(headers);

        ResponseEntity res = rest.exchange(
            serviceCodesEndpoint,
            HttpMethod.GET,
            requestEntity,
            new ParameterizedTypeReference<ArrayList<HashMap<String, String>>>() {}
        );

        if (res.getStatusCode() != HttpStatus.OK || res.getBody() == null)
        {
            log.error("No response from " + serviceCodesEndpoint);
            return new ArrayList<>();
        }

        return (ArrayList<HashMap<String, String>>)res.getBody();
    }

    private HttpHeaders getRequiredHeaders()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Basic " + conf.getBase64EncodedCredentials());
        return headers;
    }
}
