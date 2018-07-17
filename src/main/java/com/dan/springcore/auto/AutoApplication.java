package com.dan.springcore.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoApplication {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("application-auto.xml");
        ChineseCurrency chineseCurrency=context.getBean(ChineseCurrency.class);
        System.out.println(chineseCurrency);

        Car car= (Car) context.getBean("bus");
        System.out.println(car.name());
    }
}
