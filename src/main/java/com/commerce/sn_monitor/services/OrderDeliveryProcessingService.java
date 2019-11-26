package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.domain.OrderDeliveryStatus;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryRequest;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryResponse;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatus;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatusRequest;

import java.util.List;

public interface OrderDeliveryProcessingService
{

    ImlOrderDeliveryResponse makeDeliveryRequest(ImlOrderDeliveryRequest order);

    List<OrderDeliveryStatus> getOrdersStatus(ImlOrderDeliveryStatusRequest statusRequest);
}
