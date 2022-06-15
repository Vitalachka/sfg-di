package guru.sprigframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHelloWorld(){
        System.out.println("Hi Hi!");
        return "Hi!";
    }
}
