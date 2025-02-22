package com.BridgeLabz.GreetingApp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreetMessage(){
        return "Hello Guys";
    }
}
