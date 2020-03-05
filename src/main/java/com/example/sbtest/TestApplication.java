package com.example.sbtest;

import com.zjf.smdsendspringbootstarter.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {

    @Autowired
    private MsgService msgService;

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
        System.out.println("启动成功");
    }

    @GetMapping("/msg/send")
    String sendMsg(@RequestParam("msg") String msg) {
        msgService.sendMsg(msg);
        return "OK";
    }
}
