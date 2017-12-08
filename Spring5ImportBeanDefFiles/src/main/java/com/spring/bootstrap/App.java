package com.spring.bootstrap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.cmdrunner.CmdRunner;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("app.xml");
       CmdRunner cmdRunner= context.getBean("cmdRunner", CmdRunner.class);
       cmdRunner.runCmd();
    }
}
