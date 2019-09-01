package com.walterjwhite.modules.workflow.api.model.proprietary.old;

import com.walterjwhite.modules.workflow.api.model.proprietary.old.action.ApprovalAction;
import com.walterjwhite.modules.workflow.api.model.proprietary.old.action.ProvisioningAction;

public class ResourceAction {
  protected Request request;
  protected Resource resource;
  protected AccessType accessType;
  protected ApprovalAction approvalAction;
  protected ProvisioningAction provisioningAction;
}
