package com.logger.controller;

import com.logger.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class CommonLoggerController {

    @Autowired
    private LoggerService loggerService;

    @GetMapping
    public String test(){
        return loggerService.test();
    }
}
