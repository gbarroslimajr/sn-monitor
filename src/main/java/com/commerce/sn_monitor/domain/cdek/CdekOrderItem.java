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
    private CdekMoney payment;

    @JsonProperty("cost")
    private Float cost;

	@JsonProperty("weight")
    private Integer weight;

    @JsonProperty("weight_gross")
    private Integer weightGross;

    @JsonProperty("amount")
    private Integer amount;

    @JsonProperty("name_i18n")
    private String nameI18n;

    @JsonProperty("brand")
    private String brand;

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("material")
    private String material;

    @JsonProperty("wifi_gsm")
    private Boolean wifiGsm;

    @JsonProperty("url")
    private String url;
}
