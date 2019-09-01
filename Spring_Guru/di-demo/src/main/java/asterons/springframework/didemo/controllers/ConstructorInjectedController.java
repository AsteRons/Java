package asterons.springframework.didemo.controllers;


import asterons.springframework.didemo.services.GreetingService;
import asterons.springframework.didemo.services.GreetingServiceImpl;



public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}