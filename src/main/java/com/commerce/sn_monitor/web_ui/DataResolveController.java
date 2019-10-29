package com.commerce.sn_monitor.web_ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/resolve")
public class DataResolveController
{
    @GetMapping
    public String resolverForm(Model model)
    {
        return "resolverForm";
    }
}
