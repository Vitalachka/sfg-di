package guru.sprigframework.sfgdi.controllers;

import guru.sprigframework.sfgdi.Services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHelloWorld(){
        //System.out.println("Hi Hi! from My Controller sout");
        //return "Hi! from My Controller return";
        return greetingService.sayGreeting();
    }
}
