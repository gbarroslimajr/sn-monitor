package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekService
{
	@JsonProperty("code")
	private String code;
	
	@JsonProperty("parameter")
	private String parameter;
}