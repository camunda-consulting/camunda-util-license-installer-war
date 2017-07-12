package com.camunda.consulting.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.engine.ProcessEngine;

@WebListener
public class LicenseInstallerServlet implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    ProcessEngine processEngine = BpmPlatform.getDefaultProcessEngine();
    LicenseHelper.setLicense(processEngine);    
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    // nothing to do    
  }

}
