package com.dan.springcore.spel;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class StaticMethodApplication {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();


        //String方法调用
        String subStr = (String) parser.parseExpression("'hello world'.substring(0,5)").getValue();

        Integer indexValue = (Integer) parser.parseExpression("'hello world'.indexOf('he')").getValue();
        System.out.println(subStr + "," + indexValue);
        //数组和集合的解析
        int[] arr = (int[]) parser.parseExpression("new int[]{1,2,4,5}").getValue();
        for (int i : arr) {
            System.out.println(i);
        }
        List list = (List) parser.parseExpression("{1,2,3}").getValue();
//        List list= (List) parser.parseExpression("{{'a','b'},{'c','d'}}").getValue();
        System.out.println(list);

        Map map = (Map) parser.parseExpression("{userName:'张三',credit:100}").getValue();
        System.out.println(map);
        //静态方法
        Long time = (Long) parser.parseExpression("T(java.lang.System).currentTimeMillis()").getValue();
        System.out.println(time);

        //实例方法
        EvaluationContext context=new StandardEvaluationContext(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        String date= (String) parser.parseExpression("format(new java.util.Date())").getValue(context);
        System.out.println(date);
    }
}
