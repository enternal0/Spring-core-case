package com.dan.springcore.common.impl;

import com.dan.springcore.common.Shape;

public class Triangle implements Shape {
    private final Double a;
    private  final  Double b;
    private  final Double c;

    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * 面积
     * p=(a+b+c0/2;
     * s=sqrt((p-a)(p-b)(p-c)
     * @return
     */
    public Double computeArea() {
        Double p=(a+b+c)/2;
        return Math.sqrt((p-a)*(p-b)*(p-c));
    }

    /**
     * 边长
     * @return
     */
    public Double computeSide() {
        return a+b+c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ",area="+this.computeArea()+
                ",side="+this.computeSide()+
                '}';
    }
}
