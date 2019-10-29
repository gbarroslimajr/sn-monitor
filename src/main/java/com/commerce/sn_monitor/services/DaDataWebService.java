package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.domain.Location;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@ConfigurationProperties(prefix = "com.commerce.sn-monitor.data-resolver")
public class DaDataWebService implements LookupDataWebService
{
    private String API_TOKEN;
    private String ENDPOINT;
    private RestTemplate rest;

    public DaDataWebService(RestTemplate rest)
    {
        this.rest = rest;
    }

    @Override
    public Location getAddress(String ipAddress)
    {
        String addressEndpoint = this.ENDPOINT + "/iplocate/address";
        log.info(addressEndpoint);
        log.info(ipAddress);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        headers.set("Authorization", "Token " + this.API_TOKEN);

        HttpEntity requestEntity = new HttpEntity(headers);

        ResponseEntity res = rest.exchange(addressEndpoint, HttpMethod.GET, requestEntity, Location.class, ipAddress);
        log.info(res.getStatusCode().toString());

        return (Location)res.getBody();
    }

    @Override
    public Location getAddress(Float latitude, Float longitude)
    {
        return null;
    }
}
