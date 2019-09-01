package com.walterjwhite.workflow.examples.user.provisioning.step;

import com.walterjwhite.modules.workflow.api.service.executor.WorkflowStepExecutor;
import com.walterjwhite.workflow.examples.user.provisioning.request.CreateCommand;

// send an email to the requester
public class CreateRequestNotificationWorkflowStepExecutor
    implements WorkflowStepExecutor<CreateCommand> {
  protected CreateRequestNotificationWorkflowStepExecutor() {}

  @Override
  public void process(CreateCommand input) {}
}
