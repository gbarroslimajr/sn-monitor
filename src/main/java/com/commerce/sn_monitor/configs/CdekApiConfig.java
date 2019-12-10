package com.commerce.sn_monitor.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
@ConfigurationProperties(prefix = "com.commerce.sn-monitor.delivery-service.cdek")
@Data
public class CdekApiConfig
{
    public String ENDPOINT;

    private String TOKEN_GRANT_TYPE;
    private String CLIENT_ID;
    private String CLIENT_SECRET;

    public HashMap<String, String> getAuthData()
    {
        HashMap<String, String> auth = new HashMap<>();

        auth.put("grant_type", this.TOKEN_GRANT_TYPE);
        auth.put("client_id", this.CLIENT_ID);
        auth.put("client_secret", this.CLIENT_SECRET);

        return auth;
    }
}
