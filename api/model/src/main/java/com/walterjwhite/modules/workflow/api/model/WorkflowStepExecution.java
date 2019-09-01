package com.walterjwhite.modules.workflow.api.model;

import com.walterjwhite.datastore.api.model.entity.AbstractEntity;
import com.walterjwhite.datastore.api.model.entity.EntityReference;
import com.walterjwhite.modules.workflow.api.service.WorkflowStep;
import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

// PK: (sequence, workflow step)
@Data
@ToString(doNotUseGetters = true)
// @PersistenceCapable
@Entity
public class WorkflowStepExecution extends AbstractEntity {
  @Column protected int sequence;

  @Column protected Enum<? extends WorkflowStep> workflowStep;

  @ManyToOne(optional = false)
  @JoinColumn(nullable = false, updatable = false)
  protected WorkflowStepExecution previousWorkflowStepExecution;

  @ManyToOne
  @JoinColumn(insertable = false)
  protected WorkflowStepExecution nextWorkflowStepExecution;

  @EqualsAndHashCode.Exclude
  @Column(updatable = false, nullable = false)
  protected LocalDateTime start;

  @EqualsAndHashCode.Exclude
  @Column(insertable = false)
  protected LocalDateTime end;

  @EqualsAndHashCode.Exclude
  @Column(insertable = false)
  protected Throwable exception;

  @EqualsAndHashCode.Exclude
  @ManyToOne(optional = false)
  @JoinColumn(nullable = false)
  protected EntityReference workflowInputEntityReference;
}
