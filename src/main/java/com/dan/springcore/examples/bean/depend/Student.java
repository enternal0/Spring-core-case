package com.dan.springcore.examples.bean.depend;

public class Student {
   private final Integer age;
   private final String name;
   private final Integer stuNumer;

   public Student(Integer age, Integer stuNumer, String name) {
      this.age = age;
      this.stuNumer = stuNumer;
      this.name = name;
   }

   public Integer getAge() {
      return age;
   }

   public Integer getStuNumer() {
      return stuNumer;
   }

   public String getName() {
      return name;
   }

   @Override
   public String toString() {
      return "Student{" +
              "age=" + age +
              ", stuNumer=" + stuNumer +
              ", name=" + name +
              '}';
   }
}
