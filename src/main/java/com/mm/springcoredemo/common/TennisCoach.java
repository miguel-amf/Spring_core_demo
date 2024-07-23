package com.mm.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Eat 14 Tennis balls with tomato sauce";
    }
}
