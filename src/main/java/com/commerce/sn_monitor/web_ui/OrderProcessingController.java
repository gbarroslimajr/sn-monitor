package com.commerce.sn_monitor.web_ui;

import com.commerce.sn_monitor.domain.*;
import com.commerce.sn_monitor.services.CdekWebService;
import com.commerce.sn_monitor.services.ImlWebService;
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
    private ImlWebService imlDeliveryService;
    private CdekWebService cdekDeliveryService;

    @Autowired
    public OrderProcessingController(ImlWebService imlDeliveryService, CdekWebService cdekDeliveryService)
    {
        this.imlDeliveryService = imlDeliveryService;
        this.cdekDeliveryService = cdekDeliveryService;
    }

    @GetMapping("/iml")
    public String imlOrderForm(Model model)
    {
        return "imlOrderForm";
    }

    @GetMapping("/cdek")
    public String cdekOrderForm(Model model)
    {
        return "cdekOrderForm";
    }

    @GetMapping("/iml/status")
    public ResponseEntity<ArrayList<OrderDeliveryStatus>> fetchOrderStatus(OrderDeliveryStatusRequest statusRequest)
    {
        ArrayList<OrderDeliveryStatus> status = (ArrayList<OrderDeliveryStatus>) imlDeliveryService.getOrdersStatus(statusRequest);

        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @PostMapping("/iml/create")
    public ResponseEntity<OrderDelivery> sendOrderDeliveryRequest(OrderDeliveryRequest orderRequest)
    {
        OrderDelivery response = imlDeliveryService.makeDeliveryRequest(orderRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
