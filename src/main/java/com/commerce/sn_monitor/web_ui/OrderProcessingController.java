package com.commerce.sn_monitor.web_ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderProcessingController
{

    @GetMapping
    public String orderForm(Model model)
    {
        return "orderForm";
    }
}
