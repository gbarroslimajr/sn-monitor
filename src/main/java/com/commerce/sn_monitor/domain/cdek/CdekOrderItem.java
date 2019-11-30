package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;
import lombok.Data;

@Data
public class CdekOrderItem implements OrderItem
{
    private String id;
    private String barcode;
    private String version;
    private String quantity;
    private String name;
    private String description;
    private String cost;
    private String weight;
    private String width;
    private String height;
    private String length;
}
