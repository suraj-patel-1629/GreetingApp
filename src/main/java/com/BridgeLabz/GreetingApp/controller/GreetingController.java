
package com.BridgeLabz.GreetingApp.controller;


import com.BridgeLabz.GreetingApp.model.Greeting;
import com.BridgeLabz.GreetingApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    @GetMapping("/greeting2")
    public String getGreeting2() {
        return "{\"message\": \"" + greetingService.getGreetMessage() + "\"}";
    }


    @GetMapping("/personlized")
    public String userGrreting(@RequestParam(required = false) String firstName ,@RequestParam(required = false)String lastName){
        return "{\"message\":\""+greetingService.getPersonlizedGreeting(firstName,lastName)+"\" }";
    }

    @GetMapping("/greeting")
    public String getGreeting() {
        return "{\"message\": \"Hello World\"}";
    }

    @PostMapping("/greeting")
    public String postGreeting() {
        return "{\"message\": \"Greeting Created\"}";
    }

    @PutMapping("/greeting")
    public String putGreeting() {
        return "{\"message\": \"Greeting Updated\"}";
    }

    @DeleteMapping("/greeting")
    public String deleteGreeting() {
        return "{\"message\": \"Greeting Deleted\"}";
    }

    //save data to database
    @PostMapping("/save")
    public Greeting SavaGreeting(@RequestParam(required=false)String firstName,@RequestParam(required=false)String lastName){
        return greetingService.saveGreetingMsg(firstName,lastName);
    }

}
