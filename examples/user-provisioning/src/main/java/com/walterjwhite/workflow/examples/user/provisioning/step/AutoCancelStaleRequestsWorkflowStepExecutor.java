package com.walterjwhite.workflow.examples.user.provisioning.step;

import com.walterjwhite.modules.workflow.api.service.executor.WorkflowStepExecutor;
import com.walterjwhite.workflow.examples.user.provisioning.request.ApprovalCommand;

public class AutoCancelStaleRequestsWorkflowStepExecutor
    implements WorkflowStepExecutor<ApprovalCommand> {

  // protected final FindStaleRequestsQuery findStaleRequestsQuery;

  // @Inject
  public AutoCancelStaleRequestsWorkflowStepExecutor(/*Service service*/ ) {
    // this.service = service;
  }

  @Override
  public void process(ApprovalCommand approvalCommand) {
    // service.cancel(cancelRequest);
    //        for(request request:requests){
    //            // cancel(request, cancelReason => Request was not acted upon within x business
    // days and was cancelled);
    //        }
  }
}
