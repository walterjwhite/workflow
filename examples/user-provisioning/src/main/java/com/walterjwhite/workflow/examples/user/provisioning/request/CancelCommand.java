package com.walterjwhite.workflow.examples.user.provisioning.request;

import com.walterjwhite.modules.workflow.api.model.AbstractCommand;
import javax.persistence.Entity;
import lombok.Data;
import lombok.ToString;

// @PersistenceCapable
@Data
@ToString(doNotUseGetters = true)
@Entity
public class CancelCommand extends AbstractCommand {}
