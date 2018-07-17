package com.dan.springcore.examples.bean.depend;

public class Worker {
    private final String name;
    private final String company;
    private final Integer age;


    public Worker(String name, String company, Integer age) {
        this.name = name;
        this.company = company;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", age=" + age +
                '}';
    }
}
