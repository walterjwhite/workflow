package com.walterjwhite.modules.workflow.api.service;

import com.walterjwhite.modules.workflow.api.model.AbstractCommand;
import com.walterjwhite.modules.workflow.api.service.decider.Decider;
import com.walterjwhite.modules.workflow.api.service.executor.WorkflowStepExecutor;

public interface WorkflowStep<InputType extends AbstractCommand> {
  Class<? extends WorkflowStepExecutor> getExecutorClass();

  Class<? extends Decider> getDeciderClass();

  Class<InputType> getCommandClass();

  String getName();

  String getDescription();

  WorkflowStep<InputType>[] getChildren();
}
