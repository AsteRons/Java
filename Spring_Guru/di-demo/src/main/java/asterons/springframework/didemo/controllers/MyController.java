package asterons.springframework.didemo.controllers;

import asterons.springframework.didemo.services.GreetingService;
import asterons.springframework.didemo.services.PrimaryGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!");

        return greetingService.sayGreeting();
    }
}
