package com.dan.springcore.auto.impl;

import com.dan.springcore.auto.Car;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Car {

    public String name() {
        return "bike";
    }
}
