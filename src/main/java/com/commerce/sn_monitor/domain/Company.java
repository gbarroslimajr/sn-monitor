package com.commerce.sn_monitor.domain;

import lombok.Data;

@Data
public class Company
{
    private String value;
    private String unrestricted_value;
    private CompanyData data;
}
