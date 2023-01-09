package com.example.springboot_shinhanDS.Controller;

import com.example.springboot_shinhanDS.Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService ;

    @GetMapping(value ="/print")
    public String  printScreenController(){
        return demoService.printScreen();
    }
}
