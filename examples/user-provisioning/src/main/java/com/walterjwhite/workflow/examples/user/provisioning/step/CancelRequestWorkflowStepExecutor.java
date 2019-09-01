package com.walterjwhite.workflow.examples.user.provisioning.step;

import com.walterjwhite.modules.workflow.api.service.executor.WorkflowStepExecutor;
import com.walterjwhite.workflow.examples.user.provisioning.request.CancelCommand;

public class CancelRequestWorkflowStepExecutor implements WorkflowStepExecutor<CancelCommand> {

  // protected final Service service;

  // @Inject
  public CancelRequestWorkflowStepExecutor(/*Service service*/ ) {
    // this.service = service;
  }

  @Override
  public void process(CancelCommand cancelCommand) {
    // service.cancel(cancelCommand);
  }
}
