package com.dan.springcore.instance;

import com.dan.springcore.common.Shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: secondriver
 * Created: 2018/7/7
 */
public class InstanceApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "application-contex.xml"
                );

        //构造方法的实例化
        Shape shape = (Shape) context.getBean("circular");
        System.out.println(shape);

        //静态工厂方法
        ClientService clientService = (ClientService) context.getBean("clientService2");
        System.out.println(clientService.getServiceDate());

        //实例工厂方法
      ClientService clientService1= (ClientService) context.getBean("ClientServiceInstance");
        System.out.println(clientService.getServiceDate());
    }
}


