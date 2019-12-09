package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;

public class CdekPhone
{
	@JsonProperty("Number")
	private String number;
	
	@JsonProperty("Additional")
	private String additional;
}