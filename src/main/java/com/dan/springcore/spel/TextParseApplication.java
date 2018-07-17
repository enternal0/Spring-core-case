package com.dan.springcore.spel;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Date;

//文本字符解析 String int bool
public class TextParseApplication {
    public static void main(String[] args) {
        ExpressionParser parser=new SpelExpressionParser();

        //解析字符串
        String string= (String) parser.parseExpression("'hello world'").getValue();
        String str=parser.parseExpression("'null'").getValue(String.class);
        System.out.println(string+" "+str);

        //解析基本类型
        Integer integer= (Integer) parser.parseExpression("999").getValue();
        System.out.println(integer);

        //解析bool类型
        Boolean bool= (Boolean) parser.parseExpression("true").getValue();
        System.out.println(bool);


    }
}
