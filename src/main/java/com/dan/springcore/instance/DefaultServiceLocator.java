package com.dan.springcore.instance;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;

//实例工厂方法实例化
@Component
public class DefaultServiceLocator {
    @Autowired
    @Qualifier("clientService")
   private  static ClientService clientService=new ClientService();

   public ClientService createClientServiceInstance(){
       return clientService;
   }
}

