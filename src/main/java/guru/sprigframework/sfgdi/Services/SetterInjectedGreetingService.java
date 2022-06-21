package guru.sprigframework.sfgdi.Services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hi! Setter Injected Greeting Service";
    }
}
