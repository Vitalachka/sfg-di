package guru.sprigframework.sfgdi.Services;


import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hi! Constructor Greeting Service";
    }
}
