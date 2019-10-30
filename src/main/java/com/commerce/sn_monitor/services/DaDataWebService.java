package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.configs.DaDataApiConfig;
import com.commerce.sn_monitor.domain.*;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

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

        HttpHeaders headers = getRequiredHeaders();
        HttpEntity requestEntity = new HttpEntity(headers);

        ResponseEntity res = rest.exchange(
                ipEndpoint,
                HttpMethod.GET,
                requestEntity,
                LocationResource.class,
                ipAddress
        );
        log.info(res.getStatusCode().toString());
        LocationResource locRes = (LocationResource)res.getBody();

        return locRes.getLocation();
    }

    @Override
    public Location getAddress(Float latitude, Float longitude)
    {
        String geoEndpoint = conf.ENDPOINT + "/geolocate/address?lat={latitude}&lon={longitude}";

        HttpHeaders headers = getRequiredHeaders();
        HttpEntity requestEntity = new HttpEntity(headers);

        ResponseEntity res = rest.exchange(
                geoEndpoint,
                HttpMethod.GET,
                requestEntity,
                AddressResource.class,
                latitude,
                longitude
        );
        log.info(res.getStatusCode().toString());
        AddressResource addrRes = (AddressResource)res.getBody();

        return addrRes.getFirst();
    }

    @Override
    public Company getCompany(String query)
    {
        String companyEndpoint = conf.ENDPOINT + "/suggest/party";

        HashMap<String, String> params = new HashMap<>();
        params.put("query", query);

        HttpHeaders headers = getRequiredHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<HashMap<String, String>> requestEntity = new HttpEntity<>(params, headers);

        ResponseEntity res = rest.postForEntity(
                companyEndpoint,
                requestEntity,
                CompanyResource.class
        );
        log.info(res.getStatusCode().toString());
        CompanyResource companyRes = (CompanyResource)res.getBody();

        return companyRes.getFirst();
    }

    @Override
    public Bank getBank(String query)
    {
        String bankEndpoint = conf.ENDPOINT + "/suggest/bank";

        HashMap<String, String> params = new HashMap<>();
        params.put("query", query);

        HttpHeaders headers = getRequiredHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<HashMap<String, String>> requestEntity = new HttpEntity<>(params, headers);

        ResponseEntity res = rest.postForEntity(
                bankEndpoint,
                requestEntity,
                BankResource.class
        );
        log.info(res.getStatusCode().toString());
        BankResource bankRes = (BankResource)res.getBody();

        return bankRes.getFirst();
    }

    private HttpHeaders getRequiredHeaders()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        headers.set("Authorization", "Token " + conf.API_TOKEN);
        return headers;
    }
}
