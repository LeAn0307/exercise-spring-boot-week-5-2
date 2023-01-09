package com.example.springboot_shinhanDS.Service.impl;

import com.example.springboot_shinhanDS.Repository.DemoRepository;
import com.example.springboot_shinhanDS.Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoRepository demo;

    @Override
    public String printScreen() {
        return demo.printScreenRepo;
    }
}
