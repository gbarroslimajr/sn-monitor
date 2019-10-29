package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.domain.Location;

public interface LookupDataWebService
{

    Location getAddress(String ipAddress);

    Location getAddress(Float latitude, Float longitude);
}
