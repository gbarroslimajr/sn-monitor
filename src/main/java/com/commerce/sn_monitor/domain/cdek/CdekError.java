package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CdekError
{
	@JsonProperty("code")
	private String code;
	
	@JsonProperty("message")
	private String message;
}