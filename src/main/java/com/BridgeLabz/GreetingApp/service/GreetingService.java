package com.BridgeLabz.GreetingApp.service;

import com.BridgeLabz.GreetingApp.model.Greeting;
import com.BridgeLabz.GreetingApp.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String getGreetMessage(){
        return "Hello Guys";
    }


    public String getPersonlizedGreeting(String firstName,String lastName){
   if(firstName !=null && lastName !=null){
       return "Hello "+firstName +" "+lastName;
   }
   else if(firstName !=null){
       return "Hello "+firstName;
   }
   else if(lastName !=null){
       return "Hello "+lastName;
   }
   else{
       return "Hello Guys";
   }
    }

    public Greeting saveGreetingMsg(String firstName,String lastName){
        String message = getPersonlizedGreeting(firstName,lastName);
        Greeting greet = new Greeting(firstName,lastName,message);
        return greetingRepository.save(greet);
    }
    public List<Greeting> getAllGreetings(){
        List<Greeting> allGreet = greetingRepository.findAll();
        return allGreet;
    }


}

