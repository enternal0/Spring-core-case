package com.dan.springcore.examples.bean.depend;

public class Person {
    private final Student student;
    private final Worker worker;

    public Person(Student student, Worker worker) {
        this.student = student;
        this.worker = worker;
    }

    @Override
    public String toString() {
        return "Person{" +
                "student=" + student +
                ", worker=" + worker +
                '}';
    }
}
