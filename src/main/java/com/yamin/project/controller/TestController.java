package com.yamin.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping(value = "/hello")
    public Map<String,Object> test(){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("data","hello world");
        return modelMap;
    }
}
