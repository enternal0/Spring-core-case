package com.dan.springcore.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = "prototype")
public class ChineseCurrency {

    @Autowired//去Bean里面找，自动装配
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean初始化之后调用");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Bean销毁之前调用");
    }

    @Override
    public String toString() {
        return "ChineseCurrency{" +
                "person=" + person +
                '}';
    }
}
