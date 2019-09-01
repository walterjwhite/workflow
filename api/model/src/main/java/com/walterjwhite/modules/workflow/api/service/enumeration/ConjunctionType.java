package com.walterjwhite.modules.workflow.api.service.enumeration;

import com.walterjwhite.modules.workflow.api.service.decider.*;
import lombok.Getter;

@Getter
public enum ConjunctionType {
  And(AndDecider.class),
  All(AllDecider.class),
  Any(AnyDecider.class),
  Or(OrDecider.class);

  private final Class<? extends Decider> deciderClass;

  ConjunctionType(Class<? extends Decider> deciderClass) {
    this.deciderClass = deciderClass;
  }
}
