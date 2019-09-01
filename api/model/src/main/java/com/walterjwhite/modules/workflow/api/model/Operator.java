package com.walterjwhite.modules.workflow.api.model;

import com.walterjwhite.datastore.api.model.entity.AbstractNamedEntity;
import javax.persistence.Entity;

// can be a person, or workflow step executor that automatically moves jobs based on a fixed
// criteria.
// 1. create command is human
// 2. approval command is human
// 3. provisioning command is automatic / done by computer
// NOTES: if human, relate to Person entity
// if computer, log machine, CPU core, etc.
// @PersistenceCapable
@Entity
public class Operator extends AbstractNamedEntity {}
