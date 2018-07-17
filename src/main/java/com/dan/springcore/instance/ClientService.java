package com.dan.springcore.instance;

import java.util.Date;

//静态工厂方法实例化，同样需要在XML文件中配置（Bean的实例化）
public class ClientService {
    private static ClientService clientService=new ClientService();
    //构造方法私有化
    ClientService(){}

    public static ClientService getClientService(){
        return clientService;
    }

    public Date getServiceDate() {
        return new Date();
    }
}
