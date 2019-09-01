package com.walterjwhite.workflow.examples.user.provisioning;

import com.walterjwhite.modules.workflow.api.service.Workflow;
import com.walterjwhite.modules.workflow.api.service.WorkflowStep;
import lombok.Getter;

// TODO: 1. how to support branching based on the StepProcessStatus (this sounds alot like Java EE
// batch jobs ...)
@Getter
public enum ProvisionUserWorkflow implements Workflow {
  Default(
      "Workflow for provisioning users",
      ProvisionUserWorkflowSteps.values(),
      new WorkflowStep[] {ProvisionUserWorkflowSteps.Create},
      new WorkflowStep[] {ProvisionUserWorkflowSteps.Cancel}
      // TODO: add support for asynchronous children that "create" events on their own such as
      // cancelling a request after a set period of time has lapsed.
      // new Schedule[]{AutoCancelWorkflowStepExecutor.class}
      );

  private final String description;
  private final WorkflowStep[] allSteps;
  private final WorkflowStep[] startSteps;
  private final WorkflowStep[] endSteps;

  ProvisionUserWorkflow(
      String description,
      WorkflowStep[] allSteps,
      WorkflowStep[] startSteps,
      WorkflowStep[] endSteps) {
    this.description = description;
    this.allSteps = allSteps;
    this.startSteps = startSteps;
    this.endSteps = endSteps;
  }
}
