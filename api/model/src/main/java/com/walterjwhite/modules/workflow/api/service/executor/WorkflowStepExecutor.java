package com.walterjwhite.modules.workflow.api.service.executor;

import com.walterjwhite.modules.workflow.api.model.AbstractCommand;

public interface WorkflowStepExecutor<InputType extends AbstractCommand> {
  // successful, otherwise an exception must be thrown
  void process(InputType input);

  //    Class<? extends Decider> getDeciderClass();
}
