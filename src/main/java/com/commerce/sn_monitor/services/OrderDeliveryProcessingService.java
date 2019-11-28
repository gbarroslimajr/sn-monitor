package com.commerce.sn_monitor.services;

import com.commerce.sn_monitor.domain.OrderDelivery;
import com.commerce.sn_monitor.domain.OrderDeliveryRequest;
import com.commerce.sn_monitor.domain.OrderDeliveryStatus;
import com.commerce.sn_monitor.domain.OrderDeliveryStatusRequest;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryRequest;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryResponse;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatus;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatusRequest;

import java.util.List;

public interface OrderDeliveryProcessingService
{

    OrderDelivery makeDeliveryRequest(OrderDeliveryRequest order);

    List<OrderDeliveryStatus> getOrdersStatus(OrderDeliveryStatusRequest statusRequest);
}
