package guru.sprigframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHelloWorld(){
        System.out.println("Hi Hi! from My Controller sout");
        return "Hi! from My Controller return";
    }
}
