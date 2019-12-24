package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CdekContactSender
{
	@JsonProperty("company")
	private String company;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("email")
	private String email;

	@JsonProperty("phones")
	private List<CdekPhone> phones;
}