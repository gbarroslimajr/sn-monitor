package com.commerce.sn_monitor.domain;

import lombok.Data;

import java.util.HashMap;

@Data
public class Location
{

    private String value;
    private String unrestricted_value;
    private HashMap<String, String> data;

}
