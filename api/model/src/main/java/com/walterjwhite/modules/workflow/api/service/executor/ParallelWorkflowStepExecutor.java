package com.walterjwhite.modules.workflow.api.service.executor;

import com.walterjwhite.modules.workflow.api.model.AbstractCommand;

public class ParallelWorkflowStepExecutor<InputType extends AbstractCommand>
    implements WorkflowStepExecutor<InputType> {
  // successful, otherwise an exception must be thrown
  public void process(InputType input) {}

  //    Class<? extends Decider> getDeciderClass();
}
