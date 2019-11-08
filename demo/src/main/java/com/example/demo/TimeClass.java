package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
@RestController
public class TimeClass {
    @RequestMapping("/")
    public String getTime(){
        return "Current Date is : "+new Date().toString();
    }
}
