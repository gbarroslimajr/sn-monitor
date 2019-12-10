package com.commerce.sn_monitor.domain.cdek;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekOrderDelivery
{
	@JsonProperty("Uuid")
	private String uuid;
	
	@JsonProperty("Type")
	private String type;
	
	@JsonProperty("Cdek_number")
	private String cdek_number;
	
	@JsonProperty("Number")
	private String number;
	
	@JsonProperty("Tariff_code")
	private String tariff_code;
	
	@JsonProperty("Comment")
	private String comment;
	
	@JsonProperty("Shipment_point")
	private String shipment_point;
	
	@JsonProperty("Delivery_point")
	private String delivery_point;
	
	@JsonProperty("Items_cost_currency")
	private String items_cost_currency;
	
	@JsonProperty("Recipient_currency")
	private String recipient_currency;
	
	@JsonProperty("Date_invoice")
	private String date_invoice;
	
	@JsonProperty("Shipper_name")
	private String shipper_name;
	
	@JsonProperty("Shipper_address")
	private String shipper_address;
	
	@JsonProperty("Delivery_recipient_cost")
	private CdekMoney delivery_recipient_cost;
	
	@JsonProperty("Value")
	private CdekMoney value;
	
	@JsonProperty("Delivery_recipient_cost_adv")
	private List<CdekThresholdDelivery> delivery_recipient_cost_adv;
	
	@JsonProperty("Sender")
	private CdekContactSender sender;
	
	@JsonProperty("Seller")
	private CdekSeller seller;
	
	@JsonProperty("Recipient")
	private CdekContactSender recipient;
	
	@JsonProperty("From_location")
	private CdekLocation from_location;
	
	@JsonProperty("To_location")
	private CdekLocation to_location;
	
	@JsonProperty("Services")
	private List<CdekService> services;
	
	@JsonProperty("Packages")
	private List<CdekPackage> packages;
	
	@JsonProperty("Statuses")
	private CdekOrderDeliveryStatus statuses;
	
	@JsonProperty("Errors")
	private List<CdekError> errors;
}