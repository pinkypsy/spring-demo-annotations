package ua.alvin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ua.alvin.services.FortuneService;

@Component
public class TestClass {
    private final FortuneService fortuneService;

    @Autowired
        public TestClass(@Qualifier(value = "goodFortuneService")FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println(fortuneService);
    }

    public static void say(){
    }


}
