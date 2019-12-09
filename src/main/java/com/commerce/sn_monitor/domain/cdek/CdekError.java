package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;

public class CdekError
{
	@JsonProperty("Code")
	private String code;
	
	@JsonProperty("Message")
	private String message;
}