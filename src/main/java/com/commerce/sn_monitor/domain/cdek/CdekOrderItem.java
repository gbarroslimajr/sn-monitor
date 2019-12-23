package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class CdekOrderItem
{
	@JsonProperty("name")
    private String name;

    @JsonProperty("ware_Key")
    private String wareKey;

	@JsonProperty("payment")
    private String payment;

    @JsonProperty("cost")
    private String cost;

	@JsonProperty("weight")
    private String weight;

    @JsonProperty("weight_gross")
    private String weightGross;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("name_i18n")
    private String nameI18n;

    @JsonProperty("brand")
    private String brand;

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("material")
    private String material;

    @JsonProperty("wifi_gsm")
    private String wifiGsm;

    @JsonProperty("url")
    private String url;
}
