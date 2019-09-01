package asterons.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    public String hello(){
        System.out.print("Hello!");

        return "foo";
    }
}
