package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
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
	private String passportSeries;
	
	@JsonProperty("Passport_number")
	private String passportNumber;
	
	@JsonProperty("Passport_date_of_issue")
	private String passportDateOfIssue;
	
	@JsonProperty("Passport_organization")
	private String passportOrganization;
	
	@JsonProperty("Passport_date_of_birth")
	private String passportDateOfBirth;
	
	@JsonProperty("Tin")
	private String tin;
}