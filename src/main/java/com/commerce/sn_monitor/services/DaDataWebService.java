package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.configs.DaDataApiConfig;
import com.commerce.sn_monitor.domain.AddressResource;
import com.commerce.sn_monitor.domain.Location;
import com.commerce.sn_monitor.domain.LocationResource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class DaDataWebService implements LookupDataWebService
{
    private RestTemplate rest;
    private DaDataApiConfig conf;

    public DaDataWebService(RestTemplate rest, DaDataApiConfig conf)
    {
        this.rest = rest;
        this.conf = conf;
    }

    @Override
    public Location getAddress(String ipAddress)
    {
        String ipEndpoint = conf.ENDPOINT + "/iplocate/address?ip={ipAddress}";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        headers.set("Authorization", "Token " + conf.API_TOKEN);

        HttpEntity requestEntity = new HttpEntity(headers);

        LocationResource locRes = rest.exchange(
                ipEndpoint,
                HttpMethod.GET,
                requestEntity,
                LocationResource.class,
                ipAddress
        ).getBody();

        return locRes.getLocation();
    }

    @Override
    public Location getAddress(Float latitude, Float longitude)
    {
        String geoEndpoint = conf.ENDPOINT + "/geolocate/address?lat={latitude}&lon={longitude}";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        headers.set("Authorization", "Token " + conf.API_TOKEN);

        HttpEntity requestEntity = new HttpEntity(headers);

        AddressResource addrRes = rest.exchange(
                geoEndpoint,
                HttpMethod.GET,
                requestEntity,
                AddressResource.class,
                latitude,
                longitude
        ).getBody();

        return addrRes.getFirst();
    }
}
