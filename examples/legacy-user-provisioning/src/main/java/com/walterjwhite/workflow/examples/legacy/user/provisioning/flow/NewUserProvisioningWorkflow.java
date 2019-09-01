package com.walterjwhite.modules.workflow.api.model.proprietary.old.flow;

public enum NewUserProvisioningWorkflow {
  ;
  private final WorkflowStep[] sequence;

  NewUserProvisioningWorkflow(WorkflowStep[] sequence) {
    this.sequence = sequence;
  }
}
