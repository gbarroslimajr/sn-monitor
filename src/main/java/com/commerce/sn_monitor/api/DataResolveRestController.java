package com.commerce.sn_monitor.api;

import com.commerce.sn_monitor.domain.Bank;
import com.commerce.sn_monitor.domain.Company;
import com.commerce.sn_monitor.domain.Location;
import com.commerce.sn_monitor.services.LookupDataWebService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/resolve")
public class DataResolveRestController
{
    private LookupDataWebService dataService;

    public DataResolveRestController(LookupDataWebService dataService)
    {
        this.dataService = dataService;
    }

    @GetMapping("/get_city")
    public Location fetchCityForIp(@RequestParam String ip)
    {
        return dataService.getAddress(ip);
    }

    @GetMapping("/get_addr")
    public Location fetchAddress(@RequestParam Float lat, @RequestParam Float lon)
    {
        return dataService.getAddress(lat, lon);
    }

    @GetMapping("/get_company")
    public Company fetchCompany(@RequestParam String query)
    {
        return dataService.getCompany(query);
    }

    @GetMapping("/get_bank")
    public Bank fetchBank(@RequestParam String query)
    {
        return dataService.getBank(query);
    }
}
