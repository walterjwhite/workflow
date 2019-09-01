package com.walterjwhite.workflow.examples.user.provisioning.decider;

import com.walterjwhite.modules.workflow.api.service.WorkflowStep;
import com.walterjwhite.modules.workflow.api.service.decider.Decider;
import com.walterjwhite.workflow.examples.user.provisioning.ProvisionUserWorkflowSteps;
import com.walterjwhite.workflow.examples.user.provisioning.step.CreateRequestWorkflowStepExecutor;

public class CreateRequestDecider implements Decider<CreateRequestWorkflowStepExecutor> {

  @Override
  public Enum<? extends WorkflowStep> onSuccess(
      CreateRequestWorkflowStepExecutor
          createRequestWorkflowStepExecutor /*, Execution execution*/) {
    return ProvisionUserWorkflowSteps.ParallelNotificationWorkflowStep;
  }

  @Override
  public Enum<? extends WorkflowStep> onException(
      CreateRequestWorkflowStepExecutor createRequestWorkflowStepExecutor, Throwable throwable) {
    // recoverable
    if (isRecoverable(throwable)) {
      return ProvisionUserWorkflowSteps.Create;
    }

    // unrecoverable exception, request is cancelled
    // return CancelRequestWorkflowStepExecutor.class;
    return ProvisionUserWorkflowSteps.Cancel;
  }

  protected boolean isRecoverable(final Throwable throwable) {
    return false;
  }
}
