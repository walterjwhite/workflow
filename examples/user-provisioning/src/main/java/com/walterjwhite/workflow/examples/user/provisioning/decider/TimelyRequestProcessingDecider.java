package com.walterjwhite.workflow.examples.user.provisioning.decider;

import com.walterjwhite.modules.workflow.api.service.WorkflowStep;
import com.walterjwhite.modules.workflow.api.service.decider.Decider;
import com.walterjwhite.modules.workflow.api.service.executor.WorkflowStepExecutor;
import com.walterjwhite.workflow.examples.user.provisioning.ProvisionUserWorkflowSteps;
import java.time.Duration;

public class TimelyRequestProcessingDecider implements Decider {
  protected Duration maxElapsedDuration;

  @Override
  public Enum<? extends WorkflowStep> onSuccess(WorkflowStepExecutor workflowStep) {
    return continueProcessing();
  }

  protected Enum<? extends WorkflowStep> continueProcessing() {
    if (withinElapsedTimeDuration()) return ProvisionUserWorkflowSteps.Cancel;

    // return what the original step said
    return null;
  }

  protected boolean withinElapsedTimeDuration() {
    return false;
  }

  @Override
  public Enum<? extends WorkflowStep> onException(
      WorkflowStepExecutor workflowStep, Throwable throwable) {
    return continueProcessing();
  }
}
