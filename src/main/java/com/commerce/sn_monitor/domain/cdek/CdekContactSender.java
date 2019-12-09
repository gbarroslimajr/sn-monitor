package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;

public class CdekContactSender
{
	@JsonProperty("Company")
	private String company;
	
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Email")
	private String email;

	@JsonProperty("Phones")
	private List<CdekPhone> phones;
	
	@JsonProperty("Passport_series")
	private String passport_series;
	
	@JsonProperty("Passport_number")
	private String passport_number;
	
	@JsonProperty("Passport_date_of_issue")
	private String passport_date_of_issue;
	
	@JsonProperty("Passport_organization")
	private String passport_organization;
	
	@JsonProperty("Passport_date_of_birth")
	private String passport_date_of_birth;
	
	@JsonProperty("Tin")
	private String tin;
}