package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekSeller
{
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("inn")
	private String inn;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("ownership_form")
	private String ownershipForm;
	
	@JsonProperty("address")
	private String address;
}