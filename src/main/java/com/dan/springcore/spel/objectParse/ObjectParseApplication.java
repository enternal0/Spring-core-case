package com.dan.springcore.spel.objectParse;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Date;

//Spel基础表达式不需要Spring中的IOC配合，可单独使用
public class ObjectParseApplication {
    public static void main(String[] args) {

        //构造user对象
        User user=new User();
        user.setBirthPlace(new BirthPlace("China","Xi'an"));
        user.setDate(new Date());
        user.setName("Jack");
        user.setCredit(100);

        //构建Spel解析上下文
        ExpressionParser parser=new SpelExpressionParser();
       EvaluationContext context=new StandardEvaluationContext(user);

        //取基本属性,传context上下文对象提高效率
       String name= (String) parser.parseExpression("name").getValue(context);
       Date date=parser.parseExpression("date").getValue(context,Date.class);
       Integer credit= (Integer) parser.parseExpression("credit").getValue(context);
       BirthPlace birthPlace= (BirthPlace) parser.parseExpression("birthPlace").getValue(context);

        System.out.println(name+","+date+","+credit+","+birthPlace);


       //嵌套对象获取
        String nation= (String) parser.parseExpression("birthPlace.nation").getValue(context);
        String place= (String) parser.parseExpression("birthPlace.place").getValue(context);

        System.out.println(nation+"--->"+place);
    }
}
