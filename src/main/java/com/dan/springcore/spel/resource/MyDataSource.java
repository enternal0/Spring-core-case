package com.dan.springcore.spel.resource;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
//$直接注入值  #给属性注入对象
public class MyDataSource {
    @Value(value = "#{properties['url']}")
//    @Value(value = "${jdbc.url}")
    private String url;
    @Value(value = "#{properties['username']}")
//    @Value(value = "${jdbc.username}")
    private String username;
    @Value("#{properties['password']}")
//    @Value(value = "${jdbc.password}")
    private String password;
    @Value("#{properties['classname']}")
//    @Value(value = "${jdbc.classname}")
    private String classname;
}
