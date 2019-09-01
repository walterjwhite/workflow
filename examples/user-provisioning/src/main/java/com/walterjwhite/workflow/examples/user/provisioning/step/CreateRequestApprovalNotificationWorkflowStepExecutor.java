package com.walterjwhite.workflow.examples.user.provisioning.step;

import com.walterjwhite.modules.workflow.api.service.executor.WorkflowStepExecutor;
import com.walterjwhite.workflow.examples.user.provisioning.request.CreateCommand;

// send an email to the approver(s)
public class CreateRequestApprovalNotificationWorkflowStepExecutor
    implements WorkflowStepExecutor<CreateCommand> {
  protected CreateRequestApprovalNotificationWorkflowStepExecutor() {}

  @Override
  public void process(CreateCommand input) {}
}
