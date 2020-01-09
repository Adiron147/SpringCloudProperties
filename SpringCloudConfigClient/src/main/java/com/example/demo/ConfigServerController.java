package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class ConfigServerController {

    @Value("${name.encrypted}")
    private String name;
    @Value("${country}")
    private String country;

    @RequestMapping("/name")
    public String getName() {
        return this.name;
    }
    
    @RequestMapping("/country")
    public String getCountry() {
        return this.country;
    }
}
