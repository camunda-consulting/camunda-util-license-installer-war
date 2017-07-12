package com.camunda.consulting.util;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.engine.ProcessEngine;

@ProcessApplication
public class LicenseInstallerProcessApplication extends ServletProcessApplication {

  @PostDeploy
  public void setupEnvironmentForDemo(ProcessEngine engine) {
    LicenseHelper.setLicense(engine);   
  }
}
