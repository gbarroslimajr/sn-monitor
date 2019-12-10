package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekPackage
{
	@JsonProperty("Number")
	private String number;
	
	@JsonProperty("Weight")
	private String weight;
	
	@JsonProperty("Length")
	private String length;

	@JsonProperty("Width")
	private String width;
	
	@JsonProperty("Height")
	private String height;
	
	@JsonProperty("Comment")
	private String comment;

	@JsonProperty("Items")
	private List<CdekOrderItem> items;
}