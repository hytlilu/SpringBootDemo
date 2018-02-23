package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot项目启动类
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        //启动时关闭Banner
//        SpringApplicationBuilder builder = new SpringApplicationBuilder(DemoApplication.class);
//        builder.bannerMode(Banner.Mode.OFF).run(args);

    }
}
