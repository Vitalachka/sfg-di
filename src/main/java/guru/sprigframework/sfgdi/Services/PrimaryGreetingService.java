package guru.sprigframework.sfgdi.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World! Primary Greeting Service / Primary Bean";
    }
}
