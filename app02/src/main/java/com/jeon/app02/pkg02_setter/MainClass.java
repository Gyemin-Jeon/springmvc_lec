package com.jeon.app02.pkg02_setter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainClass {

  public static void main(String[] args) {

AbstractApplicationContext ctx = new AnnotationConfigApplicationContext("com.jeon.app02.pkg02_setter", "com.jeon.app02.domain");  // new AnnotationConfigApplicationContext("com.jeon.app02");
    
    Person person = ctx.getBean("person", Person.class);
    System.out.println(person);
    
    ctx.close();
    
  }

}
