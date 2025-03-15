package com.scaler.feb_module.configs;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class applicationConfig {

    @Bean
    public RestTemplate restTemplate()
    {

        return new RestTemplate();
    }
}
