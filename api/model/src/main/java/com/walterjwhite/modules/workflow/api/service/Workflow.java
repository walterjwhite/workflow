package com.walterjwhite.modules.workflow.api.service;

public interface Workflow {
  String getDescription();

  WorkflowStep[] getAllSteps();

  WorkflowStep[] getStartSteps();

  WorkflowStep[] getEndSteps();
}
