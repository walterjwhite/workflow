package com.walterjwhite.workflow.impl;

import com.walterjwhite.modules.workflow.api.model.AbstractCommand;
import com.walterjwhite.modules.workflow.api.service.WorkflowEngine;

public class WorkflowExecutor {
  public static void main(final String[] arguments) {
    WorkflowEngine workflowEngine = null;

    // CreateRequest createRequest = null;
    AbstractCommand input = null;
    workflowEngine.process(input);
  }
}
