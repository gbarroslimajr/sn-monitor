package com.commerce.sn_monitor.domain;


public interface OrderItem
{
    String getId();
    String getBarcode();
    String getVersion();
    String getQuantity();
    String getName();
    String getDescription();
    String getCost();
    String getWeight();
    String getWidth();
    String getHeight();
    String getLength();

    void setId(String id);
    void setBarcode(String barcode);
    void setVersion(String version);
    void setQuantity(String quantity);
    void setName(String name);
    void setDescription(String description);
    void setCost(String cost);
    void setWeight(String weight);
    void setWidth(String width);
    void setHeight(String height);
    void setLength(String length);
}
