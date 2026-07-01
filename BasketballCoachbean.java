package com.hello.Dependancy_demo;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Lazy
@Component
public class BasketballCoach implements Coach {

    public BasketballCoach() {
        System.out.println("In constructor: BasketballCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }

}
