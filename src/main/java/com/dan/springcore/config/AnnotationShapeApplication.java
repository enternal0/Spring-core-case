package com.dan.springcore.config;

import com.dan.springcore.common.Shape;
import com.dan.springcore.common.impl.Circular;
import com.dan.springcore.common.impl.Rectangle;
import com.dan.springcore.common.impl.Triangle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * Author: secondriver
 * @ComponentScan告诉Spring 哪个packages 的用注解标识的类 会被spring自动扫描并且装入bean容器
 * Created: 2018/7/7
 */
@Configuration
@ComponentScan(basePackages = "com.dan.springcore")
public class AnnotationShapeApplication {

    @Bean(name = "circular")
    public Shape circular() {
        return new Circular(30);
    }

    @Bean(name = "rectangle")
    public Shape rectangle() {
        return new Rectangle(10.0, 20.0);
    }

    @Bean(name = "triangle")
    public Shape triangle() {
        return new Triangle(10.0, 24.0, 30.0);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AnnotationShapeApplication.class);
        AnnotationShapeCompute annotationShapeCompute=context.getBean(AnnotationShapeCompute.class);
        Shape shape=annotationShapeCompute.compute("circular");
        System.out.println(shape);
    }
}












//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
////用注解方式构建容器IoC
//public class AnnotationConfigApplication {
//    @Bean
////    此时Spring里面已经有了一个hello对象
//    public String hello(){
//        return "hello";
//    }
//
//    @Bean(name = "pointMap")
//    public Map<String,String> javaEEPoint(){
//        Map<String,String> point=new HashMap<String, String>();
//        point.put("1","mybatis");
//        point.put("2","Spring core");
//        point.put("3","Spring mvc");
//        point.put("4","Spring boot");
//        return point;
//    }
//
//    public static void main(String[] args) {
//        //创建IOC容器
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AnnotationConfigApplication.class);
////        开始取对象
//        String hello= (String) context.getBean("hello");
//        System.out.println(hello);
//
//        Map<String,String> map= (Map<String, String>) context.getBean("pointMap");
//        System.out.println(map);
//
//        AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext(AnnotationShapeCompute.class);
//    }
//
//}



