package ua.alvin.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ua.alvin.services.FortuneService;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
//    private FortuneService [] fortuneServices;
    @Value("${tennisCoach.name}")
private String name;

    @Value("${tennisCoach.age}")
    private int age;
private FortuneService fortuneService;

@Autowired
        public TennisCoach(@Qualifier("happyFortuneService")FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


      public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getDailyWorkout() {
        return "TennisCoach";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
