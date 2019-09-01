package com.walterjwhite.modules.workflow.api.model.proprietary.old;

import java.util.Set;

public class Request {
  protected User who;
  // protected Group what;
  // protected Role role;
  // protected AccessType accessType;
  protected Set<ResourceAction> resourceActions;

  protected Set<Request> childRequests;
}
