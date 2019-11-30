package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderDeliveryStatus;
import lombok.Data;

@Data
public class CdekOrderDeliveryStatus implements OrderDeliveryStatus
{
    private String deliveryId;
    private String orderState;
    private String orderStatus;
    private String orderStateDescription;
    private String orderStatusDescription;
    private String orderStatusDate;
    private String refundState;
}
