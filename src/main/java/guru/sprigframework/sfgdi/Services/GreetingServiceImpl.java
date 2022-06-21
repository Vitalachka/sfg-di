package guru.sprigframework.sfgdi.Services;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hi! from Greeting Service Implementation";
    }
}
