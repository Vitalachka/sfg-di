package guru.sprigframework.sfgdi.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("RUS")
@Service("i18nService")
public class I18nRussianGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Привет!";
    }
}
