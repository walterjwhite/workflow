package com.walterjwhite.workflow.examples.user.provisioning.guice;

import com.walterjwhite.inject.cli.property.CommandLineHandlerShutdownTimeout;
import com.walterjwhite.inject.cli.service.AbstractCommandLineHandler;
import com.walterjwhite.property.impl.annotation.Property;
import javax.inject.Inject;

public class UserProvisioningCommandLineHandler extends AbstractCommandLineHandler {
  @Inject
  public UserProvisioningCommandLineHandler(
      @Property(CommandLineHandlerShutdownTimeout.class) int shutdownTimeoutInSeconds) {
    super(shutdownTimeoutInSeconds);
  }

  @Override
  protected void doRun(String... arguments) throws Exception {
    System.out.println("running");
  }
}
