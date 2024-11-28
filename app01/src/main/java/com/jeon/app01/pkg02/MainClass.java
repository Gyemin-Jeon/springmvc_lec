package com.jeon.app01.pkg02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

  public static void main(String[] args) {

    AbstractApplicationContext ctx = new GenericXmlApplicationContext("pkg02/appCtx.xml");
    
    Contact c = ctx.getBean("contactBean", Contact.class);
    System.out.println(c.getMobile());
    System.out.println(c.getEmail());
    
    Person p = ctx.getBean("PersonBean", Person.class);
    System.out.println(p.getName());
    System.out.println(p.getContact().getMobile());
    System.out.println(p.getContact().getEmail());
    
    ctx.close();
    
  }

}
