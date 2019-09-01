package com.walterjwhite.modules.workflow.api.view;

import com.walterjwhite.modules.workflow.api.model.Operator;
import com.walterjwhite.modules.workflow.api.service.WorkflowStep;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

// TODO: reference jpa API leveraging queries and query builders
@Getter
@RequiredArgsConstructor
public class FindPendingWorkflowStepsView {
  protected final Operator operator;
  protected final Enum<? extends WorkflowStep> workflowStep;
}
