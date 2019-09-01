package asterons.springframework.didemo.controllers;

import asterons.springframework.didemo.services.GreetingService;
import asterons.springframework.didemo.services.GreetingServiceImpl;



public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}