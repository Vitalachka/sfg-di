package guru.sprigframework.sfgdi.controllers;

import guru.sprigframework.sfgdi.Services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class TryNoQualifierConstructorInjectedController {
    private final GreetingService greetingService;

    public TryNoQualifierConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
