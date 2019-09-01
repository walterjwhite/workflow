package com.walterjwhite.workflow.examples.user.provisioning.decider;

import com.walterjwhite.modules.workflow.api.service.WorkflowStep;
import com.walterjwhite.modules.workflow.api.service.decider.Decider;
import com.walterjwhite.workflow.examples.user.provisioning.ProvisionUserWorkflowSteps;
import com.walterjwhite.workflow.examples.user.provisioning.step.ProvisionRequestWorkflowStepExecutor;

public class ProvisionRequestDecider implements Decider<ProvisionRequestWorkflowStepExecutor> {

  @Override
  public Enum<? extends WorkflowStep> onSuccess(
      ProvisionRequestWorkflowStepExecutor createRequestWorkflowStep /*, Execution execution*/) {
    return null;
  }

  @Override
  public Enum<? extends WorkflowStep> onException(
      ProvisionRequestWorkflowStepExecutor createRequestWorkflowStep, Throwable throwable) {
    // recoverable
    if (true) {
      return ProvisionUserWorkflowSteps.Provision;
    }

    // unrecoverable exception, request is cancelled
    return ProvisionUserWorkflowSteps.Cancel;
  }
}
