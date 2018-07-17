package com.dan.springcore.common.impl;

import com.dan.springcore.common.Shape;

public class Rectangle implements Shape {
    private final Double width;
    private  final  Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double computeArea() {
        return width*height;
    }

    public Double computeSide() {
        return 2*(height+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ",area="+this.computeArea()+
                ",side="+this.computeSide()+
                '}';
    }
}
