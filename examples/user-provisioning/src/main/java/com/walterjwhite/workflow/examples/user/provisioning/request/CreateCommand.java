package com.walterjwhite.workflow.examples.user.provisioning.request;

import com.walterjwhite.modules.workflow.api.model.AbstractCommand;
import java.util.Set;
import lombok.Data;
import lombok.ToString;

// @PersistenceCapable
@Data
@ToString(doNotUseGetters = true)
public class CreateCommand extends AbstractCommand {
  protected String username;
  protected String password;
  protected Set<GroupMembershipRequest> groupMembershipRequests;
}
