package com.dan.springcore.spel.objectParse;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private  String name;
    private  Date date;
    private  Integer credit;
    private BirthPlace birthPlace;
}
