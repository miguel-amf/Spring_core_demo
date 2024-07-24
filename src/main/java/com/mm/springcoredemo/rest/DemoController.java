package com.mm.springcoredemo.rest;

import com.mm.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for dependency
    private final Coach myCoach;
    private final Coach anotherCoach;

    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("Inside DemoController Constructor ");
        myCoach  = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
    @GetMapping("/check")
    public String check() {
        return STR."Comparing beans: myCoach == anotherCoach, \{myCoach == anotherCoach}";
    }
}
