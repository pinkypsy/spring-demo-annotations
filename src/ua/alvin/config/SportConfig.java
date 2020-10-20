package ua.alvin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ua.alvin.coaches.TennisCoach;
import ua.alvin.coaches.TrackCoach;
import ua.alvin.services.FortuneService;
import ua.alvin.services.GoodFortuneService;
import ua.alvin.services.HappyFortuneService;

@Configuration
@ComponentScan("ua.alvin")
@PropertySource("classpath:info.properties")
public class SportConfig {

    @Bean
    public FortuneService happyFortuneService(){
        return new HappyFortuneService();
    }

    @Bean
    public FortuneService goodFortuneService(){
        return new GoodFortuneService();
    }

    @Bean
    public TennisCoach tennisCoach(){
        return new TennisCoach(happyFortuneService());
    }
    @Bean
    public TrackCoach trackCoach(){
        return new TrackCoach(goodFortuneService());
    }
}
