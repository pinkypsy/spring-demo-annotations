package ua.alvin.services;

import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class HappyFortuneService implements FortuneService {
    public String getFortune() {
        return "HappyFortuneService";
    }
}
