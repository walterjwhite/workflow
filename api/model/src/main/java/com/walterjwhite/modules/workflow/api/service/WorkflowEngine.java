package com.walterjwhite.modules.workflow.api.service;

import com.walterjwhite.modules.workflow.api.model.WorkflowStepExecution;
import com.walterjwhite.modules.workflow.api.service.executor.WorkflowStepExecutor;
import java.io.Serializable;

public interface WorkflowEngine {
  // To be called to start a workflow, ie. CreateRequest entity would be passed here to start the
  // user provisioning workflow
  WorkflowStepExecution process(Serializable input);

  default WorkflowStepExecutor get(WorkflowStep workflowStep)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    final Class workflowStepExecutorClass = Class.forName(workflowStep.getName());
    return (WorkflowStepExecutor) workflowStepExecutorClass.newInstance();
  }
}
