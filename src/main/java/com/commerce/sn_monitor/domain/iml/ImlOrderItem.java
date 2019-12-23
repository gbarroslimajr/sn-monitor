package com.commerce.sn_monitor.domain.iml;

import com.commerce.sn_monitor.domain.OrderItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ImlOrderItem implements OrderItem
{

    @JsonProperty("productNo")
    private String id;

    @JsonProperty("productName")
    private String name;

    @JsonProperty("productVariant")
    private String version;

    @JsonProperty("productBarCode")
    private String barcode;

    @JsonProperty("couponCode")
    private String couponCode;

    @JsonProperty("discount")
    private String discount;

    @JsonProperty("weightLine")
    private String weight;

    @JsonProperty("amountLine")
    private String cost;

    @JsonProperty("statisticalValueLine")
    private String statisticalValueLine;

    @JsonProperty("itemQuantity")
    private String quantity = "1";

    @JsonProperty("deliveryService")
    private String deliveryService;

    @JsonProperty("itemType")
    private String itemType;

    @JsonProperty("itemNote")
    private String description;

    @JsonProperty("allowed")
    private String allowed;

    @JsonProperty("VATRate")
    private String vatRate;

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
