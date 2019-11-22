package com.commerce.sn_monitor.domain.dadata;

import lombok.Data;

import java.util.HashMap;

@Data
public class BankData
{
    private String bic;
    private String swift;
    private String registration_number;
    private String correspondent_account;
    private HashMap<String, String> name;
    private String payment_city;
    private String okpo;
    private HashMap<String, String> opf;
    private String phone;
    private String rkc;
    private HashMap<String, String> state;
}
