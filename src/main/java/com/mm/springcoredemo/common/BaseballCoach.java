package com.mm.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println(STR."In Constructor: \{getClass().getSimpleName()}");
    }
    @Override
    public String getDailyWorkout() {

        return "Go around beating up anti-socials like a vigilante";
    }
}
