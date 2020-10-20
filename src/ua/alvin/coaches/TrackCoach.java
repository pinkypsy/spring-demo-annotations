package ua.alvin.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ua.alvin.services.FortuneService;

@Component
public class TrackCoach  implements Coach {
    private FortuneService fortuneService;

    @Value("${trackCoach.name}")
    private String name;

    @Value("${trackCoach.age}")
    private int age;

@Autowired
    public TrackCoach(/*@Qualifier("goodFortuneService")*/FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getDailyWorkout() {
        return "TrackCoach";
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}