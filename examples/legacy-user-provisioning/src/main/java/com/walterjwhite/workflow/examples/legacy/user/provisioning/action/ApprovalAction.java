package com.walterjwhite.modules.workflow.api.model.proprietary.old.action;

import com.walterjwhite.modules.workflow.api.model.proprietary.old.ApprovalType;
import com.walterjwhite.modules.workflow.api.model.proprietary.old.Request;
import com.walterjwhite.modules.workflow.api.model.proprietary.old.User;
import java.time.LocalDateTime;

// CQRS
public class ApprovalAction {
  protected User user;

  protected LocalDateTime dateTime;

  protected ApprovalType approvalType;

  protected Request request;
}
