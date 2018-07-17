package com.dan.springcore.config;


import com.dan.springcore.common.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created: 2018/7/7
 */
@Component//(value="" 给Bean起名字)
//把普通pojo实例化到spring容器中，相当于配置文件中的
//<bean id="" class=""/>
public class AnnotationShapeCompute {

    @Autowired
    //@Autowired 注释，它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作
    @Qualifier("circular")//将要执行的Bean的名字，有两个以上的Bean类型重复，Spring不知道该装配哪一个
    private Shape circular;

    @Autowired
    @Qualifier("rectangle")
    private Shape rectangle;

    @Autowired
    @Qualifier("triangle")
    private Shape triangle;


    public Shape compute(String shapeName) {
        if (shapeName == null || shapeName.length() == 0) {
            throw new IllegalArgumentException("Not found " + shapeName);
        }
        if (shapeName.equals("circular")) {
            return circular;
        }
        if (shapeName.equals("rectangle")) {
            return rectangle;
        }
        if (shapeName.equals("triangle")) {
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





