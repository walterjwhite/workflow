package com.walterjwhite.workflow.examples.user.provisioning.decider;

import com.walterjwhite.modules.workflow.api.service.WorkflowStep;
import com.walterjwhite.modules.workflow.api.service.decider.Decider;
import com.walterjwhite.workflow.examples.user.provisioning.ProvisionUserWorkflowSteps;
import com.walterjwhite.workflow.examples.user.provisioning.step.ApprovalRequestWorkflowStepExecutor;

public class ApprovalRequestDecider implements Decider<ApprovalRequestWorkflowStepExecutor> {

  @Override
  public Enum<? extends WorkflowStep> onSuccess(
      ApprovalRequestWorkflowStepExecutor approvalRequestWorkflowStep /*, Execution execution*/) {
    return ProvisionUserWorkflowSteps.Provision;
  }

  @Override
  public Enum<? extends WorkflowStep> onException(
      ApprovalRequestWorkflowStepExecutor approvalRequestWorkflowStep, Throwable throwable) {
    // recoverable
    if (true) {
      return ProvisionUserWorkflowSteps.ParallelNotificationWorkflowStep;
    }

    // unrecoverable exception, request is cancelled
    return ProvisionUserWorkflowSteps.Cancel;
  }
}
