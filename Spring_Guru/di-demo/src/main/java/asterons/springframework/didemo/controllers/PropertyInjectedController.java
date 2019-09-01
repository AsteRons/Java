package asterons.springframework.didemo.controllers;

import asterons.springframework.didemo.services.GreetingServiceImpl;


public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}