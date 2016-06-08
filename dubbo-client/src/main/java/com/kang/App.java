package com.kang;

import com.kang.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService)ac.getBean("userService");
        System.out.println(userService.getUserName());
    }
}
