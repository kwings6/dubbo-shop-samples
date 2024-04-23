package org.apache.dubbo.shop.service.Ads;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication

public class AdServiceImplApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdServiceImplApplication.class,args);
    }
}
