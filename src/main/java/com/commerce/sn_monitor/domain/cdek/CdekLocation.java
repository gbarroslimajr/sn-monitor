package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekLocation
{
	@JsonProperty("code")
	private String code;
	
	@JsonProperty("fias_guid")
	private String fiasGuid;
	
	@JsonProperty("postal_code")
	private String postalCode;
	
	@JsonProperty("longitude")
	private String longitude;
	
	@JsonProperty("latitude")
	private String latitude;
	
	@JsonProperty("country_code")
	private String countryCode;

	@JsonProperty("region")
	private String region;

	@JsonProperty("region_code")
	private String regionCode;

	@JsonProperty("sub_region")
	private String subRegion;
	
	@JsonProperty("city")
	private String city;
	
	@JsonProperty("kladr_code")
	private String kladrCode;
	
	@JsonProperty("address")
	private String address;
}