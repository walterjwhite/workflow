package com.walterjwhite.workflow.examples.user.provisioning.step;

import com.walterjwhite.modules.workflow.api.service.executor.WorkflowStepExecutor;
import com.walterjwhite.workflow.examples.user.provisioning.request.CreateCommand;

public class CreateRequestWorkflowStepExecutor implements WorkflowStepExecutor<CreateCommand> {
  // protected final Service service;

  // @Inject
  public CreateRequestWorkflowStepExecutor(/*Service service*/ ) {
    //        this.service = service;
  }

  @Override
  public void process(CreateCommand input) {
    // service.create(input);
  }
}
