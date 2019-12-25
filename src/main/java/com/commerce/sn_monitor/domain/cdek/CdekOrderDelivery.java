package com.commerce.sn_monitor.domain.cdek;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekOrderDelivery
{
	@JsonProperty("uuid")
	private String uuid;
	
	@JsonProperty("type")
	private Integer type;
	
	@JsonProperty("cdek_number")
	private Long cdekNumber;
	
	@JsonProperty("number")
	private String number;
	
	@JsonProperty("tariff_code")
	private Integer tariffCode;
	
	@JsonProperty("comment")
	private String comment;
	
	@JsonProperty("shipment_point")
	private String shipmentPoint;
	
	@JsonProperty("delivery_point")
	private String deliveryPoint;
	
	@JsonProperty("items_cost_currency")
	private String itemsCostCurrency;
	
	@JsonProperty("recipient_currency")
	private String recipientCurrency;
	
	@JsonProperty("date_invoice")
	private String dateInvoice;
	
	@JsonProperty("shipper_name")
	private String shipperName;
	
	@JsonProperty("shipper_address")
	private String shipperAddress;
	
	@JsonProperty("delivery_recipient_cost")
	private CdekMoney deliveryRecipientCost;
	
	@JsonProperty("delivery_recipient_cost_adv")
	private List<CdekThresholdDelivery> deliveryRecipientCostAdv;
	
	@JsonProperty("sender")
	private CdekContactSender sender;
	
	@JsonProperty("seller")
	private CdekSeller seller;
	
	@JsonProperty("recipient")
	private CdekContactRecipient recipient;
	
	@JsonProperty("from_location")
	private CdekLocation fromLocation;
	
	@JsonProperty("to_location")
	private CdekLocation toLocation;
	
	@JsonProperty("services")
	private List<CdekService> services;
	
	@JsonProperty("packages")
	private List<CdekPackage> packages;
	
	@JsonProperty("statuses")
	private List<CdekOrderDeliveryStatus> statuses;
	
	@JsonProperty("errors")
	private List<CdekError> errors;
}