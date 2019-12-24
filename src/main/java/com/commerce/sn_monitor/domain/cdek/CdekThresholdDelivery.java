package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekThresholdDelivery
{
	@JsonProperty("threshold")
	private Integer threshold;
	
	@JsonProperty("sum")
	private Float sum;
	
	@JsonProperty("vat_sum")
	private Float vatSum;
	
	@JsonProperty("vat_rate")
	private Integer vatRate;
}