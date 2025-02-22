package com.BridgeLabz.GreetingApp.service;

import com.BridgeLabz.GreetingApp.model.Greeting;
import com.BridgeLabz.GreetingApp.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String getGreetMessage(){
        return "Hello Guys";
    }

 // genrating the message
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
 // saving greeting to db
    public Greeting saveGreetingMsg(String firstName,String lastName){
        String message = getPersonlizedGreeting(firstName,lastName);
        Greeting greet = new Greeting(firstName,lastName,message);
        return greetingRepository.save(greet);
    }
    // fetching all greeting from the db
    public List<Greeting> getAllGreetings(){
        List<Greeting> allGreet = greetingRepository.findAll();
        return allGreet;
    }
    // fetching the greeting by id from db
   public Greeting getGreetingsById(Long id){
       return greetingRepository.findById(id).orElse(null);

   }

}

