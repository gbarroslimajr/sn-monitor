package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekPackage
{
	@JsonProperty("number")
	private String number;
	
	@JsonProperty("weight")
	private String weight;
	
	@JsonProperty("length")
	private String length;

	@JsonProperty("width")
	private String width;
	
	@JsonProperty("height")
	private String height;
	
	@JsonProperty("comment")
	private String comment;

	@JsonProperty("items")
	private List<CdekOrderItem> items;
}