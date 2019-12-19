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
	private String fiasGuid;
	
	@JsonProperty("Postal_code")
	private String postalCode;
	
	@JsonProperty("Longitude")
	private String longitude;
	
	@JsonProperty("Latitude")
	private String latitude;
	
	@JsonProperty("Country_code")
	private String countryCode;

	@JsonProperty("Region")
	private String region;

	@JsonProperty("Region_code")
	private String regionCode;

	@JsonProperty("Sub_region")
	private String subRegion;
	
	@JsonProperty("City")
	private String city;
	
	@JsonProperty("Kladr_code")
	private String kladrCode;
	
	@JsonProperty("Address")
	private String address;
}