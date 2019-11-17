package com.commerce.sn_monitor.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.Pattern;
import java.util.List;

@Data
public class OrderDeliveryRequest
{

    @JsonProperty("Test")
    private String test;

    @JsonProperty("Job")
    private String job;

    @JsonProperty("CustomerOrder")
    private String customerOrder;

    @JsonProperty("DeliveryDate")
    @Pattern(regexp = "^\\s*(3[01]|[12][0-9]|0?[1-9])\\.(1[012]|0?[1-9])\\.((?:19|20)\\d{2})\\s*$")
    private String deliveryDate;

    @JsonProperty("Volume")
    private String volume;

    @JsonProperty("Weight")
    private String weight;

    @JsonProperty("BarCode")
    private String barCode;

    @JsonProperty("DeliveryPoint")
    private String deliveryPoint;

    @JsonProperty("DeliveryPointID")
    private String deliveryPointID;

    @JsonProperty("Phone")
    private String phone;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Contact")
    private String contact;

    @JsonProperty("IndexFrom")
    private String indexFrom;

    @JsonProperty("IndexTo")
    private String indexTo;

    @JsonProperty("RegionCodeFrom")
    private String regionCodeFrom;

    @JsonProperty("RegionCodeTo")
    private String regionCodeTo;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("TimeFrom")
    private String timeFrom;

    @JsonProperty("TimeTo")
    private String timeTo;

    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("ValuatedAmount")
    private String valuatedAmount;

    @JsonProperty("Comment")
    private String comment;

    @JsonProperty("City")
    private String city;

    @JsonProperty("PostCode")
    private String postCode;

    @JsonProperty("PostRegion")
    private String postRegion;

    @JsonProperty("PostArea")
    private String postArea;

    @JsonProperty("PostContentType")
    private String postContentType;

    @JsonProperty("Draft")
    private String draft;

    @JsonProperty("GoodItems")
    private List<OrderItem> goodItems;
}
