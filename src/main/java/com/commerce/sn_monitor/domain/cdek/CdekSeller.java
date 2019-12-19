package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekSeller
{
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Inn")
	private String inn;

	@JsonProperty("Phone")
	private String phone;

	@JsonProperty("Ownership_form")
	private String ownershipForm;
	
	@JsonProperty("Address")
	private String address;
}