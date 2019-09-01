package com.walterjwhite.workflow.examples.user.provisioning.step;

import com.walterjwhite.modules.workflow.api.service.executor.WorkflowStepExecutor;
import com.walterjwhite.workflow.examples.user.provisioning.request.ApprovalCommand;

public class ApprovalRequestWorkflowStepExecutor implements WorkflowStepExecutor<ApprovalCommand> {

  // protected final Service service;

  // @Inject
  public ApprovalRequestWorkflowStepExecutor(/*Service service*/ ) {
    // this.service = service;
  }

  @Override
  public void process(ApprovalCommand approvalCommand) {
    // service.cancel(cancelRequest);
  }
}
