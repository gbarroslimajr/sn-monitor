package com.commerce.sn_monitor.domain.iml;

import com.commerce.sn_monitor.domain.OrderItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ImlOrderItem implements OrderItem
{

    @JsonProperty("productNo")
    private String productNo;

    @JsonProperty("productName")
    private String productName;

    @JsonProperty("productVariant")
    private String productVariant;

    @JsonProperty("productBarCode")
    private String productBarCode;

    @JsonProperty("couponCode")
    private String couponCode;

    @JsonProperty("discount")
    private String discount;

    @JsonProperty("weightLine")
    private String weightLine;

    @JsonProperty("amountLine")
    private String amountLine;

    @JsonProperty("statisticalValueLine")
    private String statisticalValueLine;

    @JsonProperty("itemQuantity")
    private String itemQuantity;

    @JsonProperty("deliveryService")
    private String deliveryService;

    @JsonProperty("itemType")
    private String itemType;

    @JsonProperty("itemNote")
    private String itemNote;

    @JsonProperty("allowed")
    private String allowed;

    @JsonProperty("VATRate")
    private String vATRate;

    @JsonProperty("Length")
    private String length;

    @JsonProperty("Height")
    private String height;

    @JsonProperty("Width")
    private String width;

    @JsonProperty("GoodsClass")
    private String goodsClass;

    @JsonProperty("PaymentItemUnit")
    private String paymentItemUnit;

    @JsonProperty("PaymentItemSign")
    private String paymentItemSign;

    @JsonProperty("VendorName")
    private String vendorName;

    @JsonProperty("VendorINN")
    private String vendorINN;

    @JsonProperty("VendorPhone")
    private String vendorPhone;

    @JsonProperty("ItemCountryOrigin")
    private String itemCountryOrigin;

    @JsonProperty("CustomsDeclaration")
    private String customsDeclaration;
}
