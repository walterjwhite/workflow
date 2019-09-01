package com.walterjwhite.modules.workflow.api.model.proprietary.old.flow;

import com.walterjwhite.modules.workflow.api.model.proprietary.old.action.ApprovalAction;
import com.walterjwhite.modules.workflow.api.model.proprietary.old.action.CreateRequestAction;
import com.walterjwhite.modules.workflow.api.model.proprietary.old.action.ProvisioningAction;
import com.walterjwhite.modules.workflow.api.model.proprietary.old.validation.TargetValidation;
import com.walterjwhite.modules.workflow.api.model.proprietary.old.validation.Validation;

// TODO: implement versioning in this model
public enum WorkflowStep {
  Create("Create request", CreateRequestAction.class, TargetValidation.class),
  FirstLevelApproval("First-level approval", ApprovalAction.class),
  SecondLevelApproval("Second-level approval", ApprovalAction.class),
  Provisioning("Provisioning", ProvisioningAction.class),
  End("End children", null);

  private final String description;
  private final Class dataTypeClass;
  private final Class<? extends Validation>[] validationClasses;

  WorkflowStep(
      String description, Class dataTypeClass, Class<? extends Validation>... validationClasses) {
    this.description = description;

    this.dataTypeClass = dataTypeClass;
    this.validationClasses = validationClasses;
  }
}
