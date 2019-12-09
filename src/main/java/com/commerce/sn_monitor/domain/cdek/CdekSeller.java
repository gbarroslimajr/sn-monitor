package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;

public class CdekSeller
{
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Inn")
	private String inn;

	@JsonProperty("Phone")
	private String phone;

	@JsonProperty("Ownership_form")
	private String ownership_form;
	
	@JsonProperty("Address")
	private String address;
}