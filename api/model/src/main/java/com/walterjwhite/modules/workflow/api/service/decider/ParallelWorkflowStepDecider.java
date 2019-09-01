package com.walterjwhite.modules.workflow.api.service.decider;

import com.walterjwhite.modules.workflow.api.service.WorkflowStep;
import com.walterjwhite.modules.workflow.api.service.executor.ParallelWorkflowStepExecutor;

public class ParallelWorkflowStepDecider implements Decider<ParallelWorkflowStepExecutor> {
  @Override
  public Enum<? extends WorkflowStep> onSuccess(
      ParallelWorkflowStepExecutor parallelWorkflowStepExecutor) {
    //        for(WorkflowStep workflowStep:parallelWorkflowStepExecutor.children){
    ////            if(!workflowStep.process()){
    ////                return null;
    ////            }
    //        }

    return null;
  }

  @Override
  public Enum<? extends WorkflowStep> onException(
      ParallelWorkflowStepExecutor parallelWorkflowStepExecutor, Throwable throwable) {
    return null;
  }
}
