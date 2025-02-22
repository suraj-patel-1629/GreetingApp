
package com.BridgeLabz.GreetingApp.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingController {

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
