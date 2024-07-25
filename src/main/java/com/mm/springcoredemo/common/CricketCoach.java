package com.mm.springcoredemo.common;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    public CricketCoach() {
        System.out.println(STR."In Constructor: \{getClass().getSimpleName()}");
    }

    //init method
    @PostConstruct
    public void startTheEngines() {
        System.out.println(STR."in PostConstruct in \{getClass().getSimpleName()}");
    }
    //destroy method
    @PreDestroy
    public void lightsOut() {
        System.out.println(STR."in PreDestroy in \{getClass().getSimpleName()}");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!!!";
    }
}
