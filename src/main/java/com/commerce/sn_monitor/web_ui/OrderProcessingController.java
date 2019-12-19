package com.commerce.sn_monitor.web_ui;

import com.commerce.sn_monitor.domain.cdek.CdekOrderDeliveryRequest;
import com.commerce.sn_monitor.domain.cdek.CdekOrderDelivery;
import com.commerce.sn_monitor.domain.cdek.CdekOrderDeliveryStatusRequest;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryRequest;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryResponse;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatus;
import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatusRequest;
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
import java.util.HashMap;

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
        ArrayList<HashMap<String, String>> services = (ArrayList<HashMap<String, String>>) imlDeliveryService.getServicesData();
        model.addAttribute("services", services);

        return "imlOrderForm";
    }

    @GetMapping("/cdek")
    public String cdekOrderForm(Model model)
    {
        return "cdekOrderForm";
    }

    @GetMapping("/iml/status")
    public ResponseEntity<ArrayList<ImlOrderDeliveryStatus>> fetchOrderStatus(ImlOrderDeliveryStatusRequest statusRequest)
    {
        ArrayList<ImlOrderDeliveryStatus> status = (ArrayList<ImlOrderDeliveryStatus>)
            imlDeliveryService.getImlOrdersStatus(statusRequest);

        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @GetMapping("/cdek/status")
    public ResponseEntity<CdekOrderDelivery> fetchOrderStatus(CdekOrderDeliveryStatusRequest statusRequest)
    {
        CdekOrderDelivery status = cdekDeliveryService.getOrdersStatus(statusRequest);

        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @PostMapping("/iml/create")
    public ResponseEntity<ImlOrderDeliveryResponse> sendOrderDeliveryRequest(ImlOrderDeliveryRequest orderRequest)
    {
        ImlOrderDeliveryResponse response = imlDeliveryService.makeDeliveryRequest(orderRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/cdek/create")
    public ResponseEntity<CdekOrderDelivery> sendOrderDeliveryRequest(CdekOrderDeliveryRequest orderRequest)
    {
        CdekOrderDelivery response = cdekDeliveryService.makeDeliveryRequest(orderRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
