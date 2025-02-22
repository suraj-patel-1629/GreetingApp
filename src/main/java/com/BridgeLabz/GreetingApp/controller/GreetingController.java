
package com.BridgeLabz.GreetingApp.controller;


import com.BridgeLabz.GreetingApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
