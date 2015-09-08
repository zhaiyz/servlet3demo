package com.zhaiyz.servlet3demo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * MyListener
 * 
 * @author zhaiyz
 */
@WebListener
public class MyListener implements ServletContextListener {

    /* (non-Javadoc)
     * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context initalized!");
    }

    /* (non-Javadoc)
     * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context destroyed!");
    }

}
