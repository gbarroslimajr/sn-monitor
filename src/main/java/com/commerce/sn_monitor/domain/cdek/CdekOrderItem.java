package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;
import lombok.Data;

@Data
public class CdekOrderItem
{
	@JsonProperty("Name")
    private String name;

    @JsonProperty("Ware_Key")
    private String ware_key;

	@JsonProperty("Payment")
    private String payment;

    @JsonProperty("Cost")
    private String cost;

	@JsonProperty("Weight")
    private String weight;

    @JsonProperty("Weight_gross")
    private String weight_gross;

    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("Name_i18n")
    private String name_i18n;

    @JsonProperty("Brand")
    private String brand;

    @JsonProperty("Country_code")
    private String country_code;

    @JsonProperty("Material")
    private String material;

    @JsonProperty("Wifi_gsm")
    private String wifi_gsm;

    @JsonProperty("Url")
    private String url;
}
