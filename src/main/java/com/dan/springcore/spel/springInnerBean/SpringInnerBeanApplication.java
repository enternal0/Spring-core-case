package com.dan.springcore.spel.springInnerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInnerBeanApplication {
    public static void main(String[] args) {

//       Map<String,String> map=System.getenv();
//        for (Map.Entry<String, String> temp:map.entrySet()) {
//            System.out.println(temp);
//        }
//
//       Properties properties= System.getProperties();
//        System.out.println(properties);

        //构造IOC容器 Spring内置的bean systemProperties systemEnvironment 两种方式xml 注解@Value
        ApplicationContext context=new ClassPathXmlApplicationContext("application-spel.xml");
        //取得SystemPropertiesBean的对象
        SystemPropertiesBean systemPropertiesBean= (SystemPropertiesBean) context.getBean("systemPropertiesBean");
        System.out.println(systemPropertiesBean);

        //取得systemEnvironmentBean对象
        SystemEnvironmentBean systemEnvironmentBean= (SystemEnvironmentBean) context.getBean("environmentBean");
        System.out.println(systemEnvironmentBean);


    }
}
