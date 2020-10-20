package ua.alvin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import ua.alvin.coaches.Coach;
import ua.alvin.coaches.TennisCoach;
import ua.alvin.config.SportConfig;
import ua.alvin.services.FortuneService;
import ua.alvin.services.HappyFortuneService;
public class HelloSpringApp {

//    @Autowired
    static Coach coachStatic;



    public static void main(String[] args) {




      /*  AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        System.out.println("-------------------");
        Coach trackCoach = context.getBean("trackCoach", Coach.class);

        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());
        System.out.println(trackCoach.getName());
        System.out.println(trackCoach.getAge());


        System.out.println("-------------------");

        Coach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());
        System.out.println(tennisCoach.getName());
        System.out.println(tennisCoach.getAge());

        coachStatic = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(coachStatic);

        context.close();*/
        // write your code here
    }

//
}
