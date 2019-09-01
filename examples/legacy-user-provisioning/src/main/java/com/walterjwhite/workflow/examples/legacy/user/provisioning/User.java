package com.walterjwhite.modules.workflow.api.model.proprietary.old;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(doNotUseGetters = true)
public class User {
  protected String id;
  protected String firstName;
  protected String lastName;
}
