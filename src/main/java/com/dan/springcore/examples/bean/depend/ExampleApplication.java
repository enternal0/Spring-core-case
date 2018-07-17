package com.dan.springcore.examples.bean.depend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

public class ExampleApplication {
    public static void main(String[] args) {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("application-bean-depend.xml");

//        Person person= (Person) context.getBean("person");
//        System.out.println(person);
//
//        IdrefInstanceExample example= (IdrefInstanceExample) context.getBean("example");
//        System.out.println(example);

        ComplexObject complexObject= (ComplexObject) context.getBean("complexObject");
        System.out.println(complexObject);
        ComplexObject complexObject1= (ComplexObject) context.getBean("complexObject");
        System.out.println(complexObject==complexObject1);
        System.out.println(complexObject.hashCode());
        System.out.println(complexObject1.hashCode());

        ExampleBean exampleBean= (ExampleBean) context.getBean("exampleBean");
        System.out.println(exampleBean);


//        SetExample setExample= (SetExample) context.getBean("setExample");
//        setExample.setAge(20);
//        setExample.setName("金银花");
//        setExample.setPerson(person);
//        System.out.println(setExample);




    }
}
