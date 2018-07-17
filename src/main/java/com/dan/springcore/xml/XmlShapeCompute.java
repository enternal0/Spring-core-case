package com.dan.springcore.xml;


import com.dan.springcore.common.Shape;

/**
 * Author: secondriver
 * Created: 2018/7/7
 */
public class XmlShapeCompute {

    private Shape circular;
    private Shape rectangle;
    private Shape triangle;

    public Shape compute(String shapeName) {
        if (shapeName == null || shapeName.length() == 0) {
            throw new IllegalArgumentException("Not found " + shapeName);
        }
        if ("circular".equals(shapeName)) {
            return circular;
        }
        if ("rectangle".equals(shapeName)) {
            return rectangle;
        }
        if ("triangle".equals(shapeName)) {
            return triangle;
        }
        throw new IllegalArgumentException("Not found " + shapeName);
    }

    public void setTriangle(Shape triangle) {
        this.triangle = triangle;
    }

    public void setRectangle(Shape rectangle) {
        this.rectangle = rectangle;
    }

    public void setCircular(Shape circular) {
        this.circular = circular;
    }

}
