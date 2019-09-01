package com.walterjwhite.workflow.examples.user.provisioning;

import com.walterjwhite.modules.workflow.api.model.AbstractCommand;
import com.walterjwhite.modules.workflow.api.service.ParallelWorkflowStep;
import com.walterjwhite.modules.workflow.api.service.WorkflowStep;
import com.walterjwhite.modules.workflow.api.service.decider.Decider;
import com.walterjwhite.modules.workflow.api.service.enumeration.ConjunctionType;
import com.walterjwhite.modules.workflow.api.service.executor.ParallelWorkflowStepExecutor;
import com.walterjwhite.modules.workflow.api.service.executor.WorkflowStepExecutor;
import com.walterjwhite.workflow.examples.user.provisioning.decider.ApprovalRequestDecider;
import com.walterjwhite.workflow.examples.user.provisioning.decider.CancelRequestDecider;
import com.walterjwhite.workflow.examples.user.provisioning.decider.CreateRequestDecider;
import com.walterjwhite.workflow.examples.user.provisioning.decider.ProvisionRequestDecider;
import com.walterjwhite.workflow.examples.user.provisioning.request.ApprovalCommand;
import com.walterjwhite.workflow.examples.user.provisioning.request.CancelCommand;
import com.walterjwhite.workflow.examples.user.provisioning.request.CreateCommand;
import com.walterjwhite.workflow.examples.user.provisioning.request.ProvisionCommand;
import com.walterjwhite.workflow.examples.user.provisioning.step.*;
import lombok.Getter;

@Getter
public enum ProvisionUserWorkflowSteps implements WorkflowStep {
  Create(
      CreateRequestWorkflowStepExecutor.class,
      CreateRequestDecider.class,
      CreateCommand.class,
      "Create Request"),
  // TODO: refactor this to support parallel flows here
  RequestCreationNotificationChild(
      CreateRequestNotificationWorkflowStepExecutor.class,
      null,
      null,
      "Send out notification of request creation"),
  ApprovalNotificationChild(
      CreateRequestApprovalNotificationWorkflowStepExecutor.class,
      null,
      null,
      "Send out approval notification"),

  ParallelNotificationWorkflowStep(
      ParallelWorkflowStepExecutor.class,
      null,
      null,
      "Send out notifications in parallel",
      new ParallelWorkflowStep(
          ConjunctionType.All, RequestCreationNotificationChild, ApprovalNotificationChild)),

  Approve(
      ApprovalRequestWorkflowStepExecutor.class,
      ApprovalRequestDecider.class,
      ApprovalCommand.class,
      "Approve the request"),
  Cancel(
      CancelRequestWorkflowStepExecutor.class,
      CancelRequestDecider.class,
      CancelCommand.class,
      "Cancel the request"),
  Provision(
      ProvisionRequestWorkflowStepExecutor.class,
      ProvisionRequestDecider.class,
      ProvisionCommand.class,
      "Provision the request");

  // InactivityCancellation(ProvisionRequestWorkflowStepExecutor.class,
  // ProvisionRequestDecider.class, ProvisionCommand.class, "Cancel the request after a fixed amount
  // of inactivity");

  private final Class<? extends WorkflowStepExecutor> executorClass;
  private final Class<? extends Decider> deciderClass;
  private final Class<? extends AbstractCommand> commandClass;

  private final String description;
  private final WorkflowStep[] children;

  ProvisionUserWorkflowSteps(
      Class<? extends WorkflowStepExecutor> executorClass,
      Class<? extends Decider> deciderClass,
      Class<? extends AbstractCommand> commandClass,
      String description,
      WorkflowStep... children) {
    this.executorClass = executorClass;
    this.deciderClass = deciderClass;
    this.commandClass = commandClass;
    this.description = description;
    this.children = children;
  }

  public String getName() {
    return name();
  }
}
