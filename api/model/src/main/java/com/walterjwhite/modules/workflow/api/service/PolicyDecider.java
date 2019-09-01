package com.walterjwhite.modules.workflow.api.service;

import com.walterjwhite.modules.workflow.api.service.decider.Decider;
import com.walterjwhite.modules.workflow.api.service.executor.WorkflowStepExecutor;

// Audits the execution of the workflow to ensure it is following policy
public class PolicyDecider implements Decider {
  @Override
  public Enum<? extends WorkflowStep> onSuccess(WorkflowStepExecutor workflowStep) {
    return null;
  }

  @Override
  public Enum<? extends WorkflowStep> onException(
      WorkflowStepExecutor workflowStep, Throwable throwable) {
    return null;
  }
}
