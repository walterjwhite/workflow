package com.walterjwhite.workflow.examples.user.provisioning.guice;

import com.walterjwhite.inject.cli.property.OperatingMode;
import com.walterjwhite.inject.cli.service.AbstractCommandLineHandler;
import com.walterjwhite.property.api.annotation.DefaultValue;
import lombok.Getter;

@Getter
public enum UserProvisioningOperatingMode implements OperatingMode {
  @DefaultValue
  Standard(UserProvisioningCommandLineHandler.class);

  private final Class<? extends AbstractCommandLineHandler> initiatorClass;

  UserProvisioningOperatingMode(Class<? extends AbstractCommandLineHandler> initiatorClass) {
    this.initiatorClass = initiatorClass;
  }
}
