package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
    System.out.println("context destroyed");
    sce.getServletContext().getAttribute("counter");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("context Initialized");
        sce.getServletContext().getAttribute("counter");
    }
	
}
