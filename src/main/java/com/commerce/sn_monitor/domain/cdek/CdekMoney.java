package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekMoney
{
	@JsonProperty("value")
	private String value;
	
	@JsonProperty("vat_sum")
	private String vatSum;
	
	@JsonProperty("vat_rate")
	private String vatRate;
}