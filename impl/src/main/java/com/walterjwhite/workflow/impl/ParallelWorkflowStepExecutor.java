package com.walterjwhite.workflow.impl;

import com.walterjwhite.modules.workflow.api.model.AbstractCommand;
import com.walterjwhite.modules.workflow.api.service.executor.WorkflowStepExecutor;

public class ParallelWorkflowStepExecutor implements WorkflowStepExecutor {
  @Override
  public void process(AbstractCommand input) {
    // queue children in parallel then join them

    // jobs = new ();
    // for(step step:children)
    //    jobs.add(queueService.queue())

    // queueService.join(jobs, retryPolicy)
  }
}
