package com.spring.bootstrap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.cmd.Command;
import com.spring.cmdrunner.CmdRunner;

public class App 
{
    public static void main( String[] args ) {
       
    	ApplicationContext cxt= new ClassPathXmlApplicationContext("app.xml");
    	CmdRunner cmdRunner=cxt.getBean(CmdRunner.class);
    	cmdRunner.runCmd();
    }
}
