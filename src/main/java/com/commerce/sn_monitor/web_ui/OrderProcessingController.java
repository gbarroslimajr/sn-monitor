package com.commerce.sn_monitor.web_ui;

import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatus;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatusRequest;
import com.commerce.sn_monitor.services.OrderDeliveryProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public ResponseEntity<ImlOrderDeliveryStatus> fetchOrderStatus(ImlOrderDeliveryStatusRequest statusRequest)
    {
        ImlOrderDeliveryStatus status = deliveryService.getOrdersStatus(statusRequest);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
}
