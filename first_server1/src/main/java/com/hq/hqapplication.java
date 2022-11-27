package com.hq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;


@EnableDiscoveryClient
@SpringBootApplication
public class hqapplication {
    public static void main(String[] args) {
        SpringApplication.run(hqapplication.class,args);
    }

    @RestController
    @RequestMapping("/hqtest")
    class testRequest{

        @GetMapping("/{userId}")
        public String computeData(@PathVariable String userId) {
            log.println(
                    8000
            );

            return "我是hq服务"+userId;
        }
    }



}
