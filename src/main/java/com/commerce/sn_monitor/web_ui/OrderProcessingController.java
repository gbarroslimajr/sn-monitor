package com.commerce.sn_monitor.web_ui;

import com.commerce.sn_monitor.domain.*;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryRequest;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryResponse;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatus;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatusRequest;
import com.commerce.sn_monitor.services.OrderDeliveryProcessingService;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/order")
public class OrderProcessingController
{
    private OrderDeliveryProcessingService deliveryService;

    @Autowired
    public OrderProcessingController(OrderDeliveryProcessingService deliveryService)
    {
        this.deliveryService = deliveryService;
    }

    @GetMapping
    public String orderForm(Model model)
    {
        return "orderForm";
    }

    @GetMapping("/status")
    public ResponseEntity<ArrayList<OrderDeliveryStatus>> fetchOrderStatus(OrderDeliveryStatusRequest statusRequest)
    {
        ArrayList<OrderDeliveryStatus> status = (ArrayList<OrderDeliveryStatus>) deliveryService.getOrdersStatus(statusRequest);

        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<OrderDelivery> sendOrderDeliveryRequest(OrderDeliveryRequest orderRequest)
    {
        OrderDelivery response = deliveryService.makeDeliveryRequest(orderRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
