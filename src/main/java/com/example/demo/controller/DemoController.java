package com.example.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

/**
 * @author mojinpeng
 * @version 1.0
 * @date 2019/11/19 8:09
 */
@RestController
@RequestMapping(value = "/demo")
@Api(tags = "测试")
public class DemoController {
    @GetMapping(value = "/hello")
    public String hello(){
        String json = "hello spring boot";
        return  json;
    }
}
