package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.domain.dadata.Bank;
import com.commerce.sn_monitor.domain.dadata.Company;
import com.commerce.sn_monitor.domain.dadata.Location;

public interface LookupDataWebService
{

    Location getAddress(String ipAddress);

    Location getAddress(Float latitude, Float longitude);

    Company getCompany(String query);

    Bank getBank(String query);
}
