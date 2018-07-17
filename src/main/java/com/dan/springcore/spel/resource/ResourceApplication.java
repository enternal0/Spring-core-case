package com.dan.springcore.spel.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.*;
import java.net.MalformedURLException;

public class ResourceApplication {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("application-spel.xml");
//        MyDataSource myDataSource = (MyDataSource) context.getBean("myDataSource");
//        System.out.println(myDataSource);

        //从classPath路径出读取内容写到D:\\dataBase.properties
//        Resource resource=new ClassPathResource("dataBase.properties");
        InputStream is=null;
        OutputStream os=null;
        try {
            Resource resource=new UrlResource("http://pic.sogou.com/d?query=%E5%8D%A1%E9%80%9A%E5%9B%BE%E7%89%87&ie=utf8&page=1&did=1&st=255&mode=255&phu=http%3A%2F%2Fpica.nipic.com%2F2008-02-19%2F20082199347668_2.jpg&p=40230500#did0");
            is=resource.getInputStream();
            os=new FileOutputStream("E:\\dataBase.properties");
            int temp=0;
            byte[] result=new byte[1024];
            while((temp=is.read(result))!=-1){
                os.write(result,0,temp);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        //测试loadResource方法
        Resource resourceFile=loadResource("File:E:\\dataBase.properties");
        System.out.println(resourceFile);
        Resource resource=new FileSystemResource("E:\\dataBase.properties");
        System.out.println(resource);

    }
    private static  Resource loadResource(String fileName){
        if(null==fileName || fileName.length()==0) return null;

        if(fileName.startsWith("classpath:")){
            return new ClassPathResource(fileName.substring("classpath:".length()));
        }
        if(fileName.startsWith("File:")){
            return new FileSystemResource(fileName.substring("File:".length()));
        }
        if(fileName.startsWith("http")){
            try {
                return new UrlResource(fileName.substring("http".length()));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}


