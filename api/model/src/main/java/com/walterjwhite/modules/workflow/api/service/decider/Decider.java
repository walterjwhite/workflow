package com.walterjwhite.modules.workflow.api.service.decider;

import com.walterjwhite.modules.workflow.api.service.WorkflowStep;
import com.walterjwhite.modules.workflow.api.service.executor.WorkflowStepExecutor;

public interface Decider<WorkflowStepExecutorType extends WorkflowStepExecutor> {
  Enum<? extends WorkflowStep> onSuccess(WorkflowStepExecutorType workflowStep);

  Enum<? extends WorkflowStep> onException(
      WorkflowStepExecutorType workflowStep, Throwable throwable);
}
