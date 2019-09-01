package com.walterjwhite.modules.workflow.api.model.proprietary.old.validation;

import java.io.Serializable;

public interface Validation<DataType extends Serializable> {
  void validate(DataType dataType);
}
