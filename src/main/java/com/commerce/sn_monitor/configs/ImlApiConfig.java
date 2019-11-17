package com.commerce.sn_monitor.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "com.commerce.sn-monitor.delivery-service")
@Data
public class ImlApiConfig
{
    public String LOGIN;
    public String PASSWORD;
}
