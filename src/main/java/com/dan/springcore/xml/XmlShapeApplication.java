package com.dan.springcore.xml;


import com.dan.springcore.common.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Author: secondriver
 * Created: 2018/7/7
 */
public class XmlShapeApplication {

    public static void main(String[] args) {
        //使用Spring的IoC容器
        //new方式构造IoC容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-contex.xml");

        XmlShapeCompute xmlShapeCompute= (XmlShapeCompute) context.getBean("shapeCompute");

        System.out.println(xmlShapeCompute.compute("rectangle"));


    }
}

