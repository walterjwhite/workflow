package com.walterjwhite.modules.workflow.api.model;

import com.walterjwhite.datastore.api.model.entity.AbstractEntity;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

// @PersistenceAware
@MappedSuperclass
@Embeddable
@Getter
@Setter
public abstract class AbstractCommand extends AbstractEntity {
  @Column(nullable = false, updatable = false)
  protected LocalDateTime createDateTime = LocalDateTime.now();

  // TESTING PURPOSES ONLY, this would give me type safety and I could remove the entity type
  // reference ...
  @Column protected Enum workflowEnumType;

  @Column protected String comments;
}
