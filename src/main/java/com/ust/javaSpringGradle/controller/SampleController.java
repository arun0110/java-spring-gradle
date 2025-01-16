package com.ust.javaSpringGradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("sample-get")
    public String sampleGetMethod(){
        return "Success";
    }
}
