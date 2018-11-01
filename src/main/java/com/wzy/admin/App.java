package com.wzy.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by wzy on 2018/11/1 22:36
 **/



@SpringBootApplication
@ImportResource(locations = "classpath:sercurity.xml")
public class App {

    public static void main(String args[]) {
        SpringApplication.run(App.class,args);
    }
}
