package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekLocation
{
	@JsonProperty("Code")
	private String code;
	
	@JsonProperty("Fias_guid")
	private String fias_guid;
	
	@JsonProperty("Postal_code")
	private String postal_code;
	
	@JsonProperty("Longitude")
	private String longitude;
	
	@JsonProperty("Latitude")
	private String latitude;
	
	@JsonProperty("Country_code")
	private String country_code;

	@JsonProperty("Region")
	private String region;

	@JsonProperty("Region_code")
	private String region_code;

	@JsonProperty("Sub_region")
	private String sub_region;
	
	@JsonProperty("City")
	private String city;
	
	@JsonProperty("Kladr_code")
	private String kladr_code;
	
	@JsonProperty("Address")
	private String address;
}