package com.dan.springcore.examples.bean.depend;

public class ExampleBean {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ExampleBean{" +
                "email='" + email + '\'' +
                '}';
    }
}
