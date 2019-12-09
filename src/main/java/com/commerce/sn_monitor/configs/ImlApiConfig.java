package com.commerce.sn_monitor.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Base64;

@Configuration
@ConfigurationProperties(prefix = "com.commerce.sn-monitor.delivery-service.iml")
@Data
public class ImlApiConfig
{
    public String LOGIN;
    public String PASSWORD;
    public String ENDPOINT;
    public String VOC_ENDPOINT;

    public String getBase64EncodedCredentials()
    {
        byte[] encodedBytes = Base64.getEncoder().encode((this.LOGIN + this.PASSWORD).getBytes());
        return new String(encodedBytes);
    }
}
