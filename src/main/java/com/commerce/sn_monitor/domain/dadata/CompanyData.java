package com.commerce.sn_monitor.domain.dadata;

import lombok.Data;

import java.util.HashMap;

@Data
public class CompanyData
{
    private Location address;
    private String branch_count;
    private String branch_type;
    private String inn;
    private String kpp;
    private String ogrn;
    private String ogrn_date;
    private String hid;
    private HashMap<String, String> management;
    private HashMap<String, String> name;
    private String okpo;
    private String okved;
    private String okved_type;
    private HashMap<String, String> opf;
    private HashMap<String, String> state;
    private String type;
}
