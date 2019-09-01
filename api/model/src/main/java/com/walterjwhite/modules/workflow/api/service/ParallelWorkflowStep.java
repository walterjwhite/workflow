package com.walterjwhite.modules.workflow.api.service;

import com.walterjwhite.modules.workflow.api.model.AbstractCommand;
import com.walterjwhite.modules.workflow.api.service.decider.Decider;
import com.walterjwhite.modules.workflow.api.service.enumeration.ConjunctionType;
import com.walterjwhite.modules.workflow.api.service.executor.WorkflowStepExecutor;
import lombok.Getter;

@Getter
public class ParallelWorkflowStep<InputType extends AbstractCommand>
    implements WorkflowStep<InputType> {
  protected final ConjunctionType conjunctionType;
  protected final WorkflowStep<InputType>[] children;

  public ParallelWorkflowStep(ConjunctionType conjunctionType, WorkflowStep... children) {
    this.conjunctionType = conjunctionType;
    this.children = children;
  }

  //    @Override
  //    public void process(InputType input) {
  //        // TODO: execute in parallel and track each step's status
  //        // TODO: use the queue api to queue up these jobs and join them back together once all
  // complete or any fail
  //    }

  @Override
  public Class<? extends WorkflowStepExecutor> getExecutorClass() {
    return null;
  }

  @Override
  public Class<? extends Decider> getDeciderClass() {
    return conjunctionType.getDeciderClass();
  }

  @Override
  public Class<InputType> getCommandClass() {
    return null;
  }

  @Override
  public String getName() {
    return getClass().getName();
  }

  @Override
  public String getDescription() {
    return "Execute workflow children in parallel";
  }
}
