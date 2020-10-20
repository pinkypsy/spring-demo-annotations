package ua.alvin.services;

import org.springframework.stereotype.Component;

@Component
public class GoodFortuneService implements FortuneService {
    public String getFortune() {
        return "GoodFortuneService";
    }
}
