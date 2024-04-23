package org.apache.dubbo.shop.web.ads;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class AdsControllerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdsControllerApplication.class,args);
    }
}
