package com.dan.springcore.examples.bean.depend;

public class IdrefInstanceExample {
    private final String string;

    public IdrefInstanceExample(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "IdrefInstanceExample{" +
                "string='" + string + '\'' +
                '}';
    }
}
