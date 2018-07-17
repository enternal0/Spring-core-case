package com.dan.springcore.common.impl;

import com.dan.springcore.common.Shape;
//有叶子是被SpringIOC容器托管了，以后自己不需要再手工new了
public class Circular implements Shape {
    private final double radius;

    public Circular(double radius) {
        this.radius = radius;
    }

    public Double computeArea() {
       return Math.PI*Math.pow(radius,2);
    }

    public Double computeSide() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circular{" +
                "radius=" + radius +
                ",area="+this.computeArea()+
                ",side="+this.computeSide()+
                '}';
    }
}
