package com.commerce.sn_monitor.domain;

import lombok.Data;

import java.util.List;

@Data
public class AddressResource
{
    private List<Location> suggestions;
}
