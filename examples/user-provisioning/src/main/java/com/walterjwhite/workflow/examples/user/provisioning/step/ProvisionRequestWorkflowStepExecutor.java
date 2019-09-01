package com.walterjwhite.workflow.examples.user.provisioning.step;

import com.walterjwhite.modules.workflow.api.service.executor.WorkflowStepExecutor;
import com.walterjwhite.workflow.examples.user.provisioning.request.ProvisionCommand;

public class ProvisionRequestWorkflowStepExecutor
    implements WorkflowStepExecutor<ProvisionCommand> {

  // protected final Service service;

  // @Inject
  public ProvisionRequestWorkflowStepExecutor(/*Service service*/ ) {
    // this.service = service;
  }

  @Override
  public void process(ProvisionCommand provisionCommand) {
    // service.cancel(cancelRequest);
  }
}
