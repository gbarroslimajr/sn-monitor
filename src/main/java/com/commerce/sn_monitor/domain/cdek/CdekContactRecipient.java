package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CdekContactRecipient
{
	@JsonProperty("company")
	private String company;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("email")
	private String email;

	@JsonProperty("phones")
	private List<CdekPhone> phones;
	
	@JsonProperty("passport_series")
	private String passportSeries;
	
	@JsonProperty("passport_number")
	private String passportNumber;
	
	@JsonProperty("passport_date_of_issue")
	private String passportDateOfIssue;
	
	@JsonProperty("passport_organization")
	private String passportOrganization;
	
	@JsonProperty("passport_date_of_birth")
	private String passportDateOfBirth;
	
	@JsonProperty("tin")
	private String tin;
}