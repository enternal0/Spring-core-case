package com.dan.springcore.auto.impl;

import com.dan.springcore.auto.Car;
import org.springframework.stereotype.Component;

/**
 * Author: secondriver
 * Created: 2018/7/11
 */
@Component
public class Bus implements Car {

    public String name() {
        return "bus";
    }
}
