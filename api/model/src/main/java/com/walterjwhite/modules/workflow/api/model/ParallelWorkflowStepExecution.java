package com.walterjwhite.modules.workflow.api.model;

import javax.persistence.Entity;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(doNotUseGetters = true)
// @PersistenceCapable
@Entity
public class ParallelWorkflowStepExecution extends WorkflowStepExecution {
  // ie. notify approvers & notify requester

  // criteria
  // AND, OR?
}
