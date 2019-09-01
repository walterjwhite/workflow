package com.walterjwhite.modules.workflow.api.service;

/**
 * Fires an event (AbstractCallable) which will initiate another workflow step In the case for user
 * provisioning, this cancels a request if there is no activity within a set period of time. The
 * command it creates then activates the cancellation workflow step which can also be manually
 * invoked at any time.
 */
public class TimerJob {
  // protected Schedule schedule;
}
