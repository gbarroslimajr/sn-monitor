package com.commerce.sn_monitor;

import com.commerce.sn_monitor.configs.DaDataApiConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SocialNetworkMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialNetworkMonitorApplication.class, args);
	}

}
