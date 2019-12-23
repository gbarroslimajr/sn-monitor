package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekThresholdDelivery
{
	@JsonProperty("threshold")
	private String threshold;
	
	@JsonProperty("sum")
	private String sum;
	
	@JsonProperty("vat_sum")
	private String vatSum;
	
	@JsonProperty("vat_rate")
	private String vatRate;
}