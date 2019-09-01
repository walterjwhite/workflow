package com.walterjwhite.modules.workflow.api.service.decider;

import com.walterjwhite.modules.workflow.api.service.WorkflowStep;
import com.walterjwhite.modules.workflow.api.service.executor.ParallelWorkflowStepExecutor;

public class AndDecider implements Decider<ParallelWorkflowStepExecutor> {
  @Override
  public Enum<? extends WorkflowStep> onSuccess(ParallelWorkflowStepExecutor workflowStepExecutor) {
    return null;
  }

  @Override
  public Enum<? extends WorkflowStep> onException(
      ParallelWorkflowStepExecutor workflowStepExecutor, Throwable throwable) {
    return null;
  }
}
