package com.walterjwhite.workflow.examples.user.provisioning.decider;

import com.walterjwhite.modules.workflow.api.service.WorkflowStep;
import com.walterjwhite.modules.workflow.api.service.decider.Decider;
import com.walterjwhite.workflow.examples.user.provisioning.ProvisionUserWorkflowSteps;
import com.walterjwhite.workflow.examples.user.provisioning.step.CancelRequestWorkflowStepExecutor;

public class CancelRequestDecider implements Decider<CancelRequestWorkflowStepExecutor> {

  @Override
  public Enum<? extends WorkflowStep> onSuccess(
      CancelRequestWorkflowStepExecutor createRequestWorkflowStep /*, Execution execution*/) {
    return null;
  }

  @Override
  public Enum<? extends WorkflowStep> onException(
      CancelRequestWorkflowStepExecutor createRequestWorkflowStep, Throwable throwable) {
    // recoverable
    if (true) {
      return ProvisionUserWorkflowSteps.Cancel;
    }

    // unrecoverable exception, request is cancelled
    return null;
  }
}
