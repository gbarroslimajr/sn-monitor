package com.commerce.sn_monitor.domain.cdek;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekOrderDeliveryRequest
{
	@JsonProperty("type")
	private Integer type = 2;

	@JsonProperty("Number")
	private String number;

	@JsonProperty("Tariff_code")
	private String tariffCode;
	
	@JsonProperty("Comment")
	private String comment;

	@JsonProperty("Shipment_point")
	private String shipmentPoint;
	
	@JsonProperty("Delivery_point")
	private String deliveryPoint;

	@JsonProperty("Items_cost_currency")
	private String itemsCostCurrency;
	
	@JsonProperty("Recipient_currency")
	private String recipientCurrency;

	@JsonProperty("Date_invoice")
	private String dateInvoice;

	@JsonProperty("Shipper_name")
	private String shipperName;
	
	@JsonProperty("Shipper_address")
	private String shipperAddress;

	@JsonProperty("Delivery_recipient_cost")
	private CdekMoney deliveryRecipientCost;

	@JsonProperty("Value")
	private CdekMoney value;
	
	@JsonProperty("Delivery_recipient_cost_adv")
	private List<CdekThresholdDelivery> deliveryRecipientCostAdv;

	@JsonProperty("Sender")
	private CdekContactSender sender;

	@JsonProperty("Seller")
	private CdekSeller seller;

	@JsonProperty("Recipient")
	private CdekContactSender recipient;

	@JsonProperty("From_location")
	private CdekLocation fromLocation;
	
	@JsonProperty("To_location")
	private CdekLocation toLocation;

	@JsonProperty("Services")
	private List<CdekService> services;

	@JsonProperty("Packages")
	private List<CdekPackage> packages;
}