package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class CdekOrderItem
{
	@JsonProperty("Name")
    private String name;

    @JsonProperty("Ware_Key")
    private String wareKey;

	@JsonProperty("Payment")
    private String payment;

    @JsonProperty("Cost")
    private String cost;

	@JsonProperty("Weight")
    private String weight;

    @JsonProperty("Weight_gross")
    private String weightGross;

    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("Name_i18n")
    private String nameI18n;

    @JsonProperty("Brand")
    private String brand;

    @JsonProperty("Country_code")
    private String countryCode;

    @JsonProperty("Material")
    private String material;

    @JsonProperty("Wifi_gsm")
    private String wifiGsm;

    @JsonProperty("Url")
    private String url;
}
