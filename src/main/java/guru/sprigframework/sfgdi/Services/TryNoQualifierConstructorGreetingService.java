package guru.sprigframework.sfgdi.Services;

import org.springframework.stereotype.Service;

@Service
public class TryNoQualifierConstructorGreetingService {
    public String sayGreeting() {
        return "Hi! Try No Qualifier Constructor Greeting Service";
    }
}
