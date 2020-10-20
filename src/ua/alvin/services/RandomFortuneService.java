package ua.alvin.services;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class RandomFortuneService implements FortuneService {
    public String getFortune() {
        String[] fortunes = new String[]{"GoodFortune", "HappyFortune", "SecretFortune"};
        Random random = new Random();

        return fortunes[random.nextInt(fortunes.length)];
    }
}
