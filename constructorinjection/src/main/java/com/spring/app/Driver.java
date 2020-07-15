package com.spring.app;

import com.spring.app.*;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Driver {
	
public static void main(String[] args)
{
    
	ApplicationContext custObj = new ClassPathXmlApplicationContext("applicationContext.xml");
	MemberShip membership = (MemberShip) custObj.getBean("membership");
	System.out.println(membership);
}

}
