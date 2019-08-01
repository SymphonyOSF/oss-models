/*
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.canon.facade;

import java.time.Instant;

import org.symphonyoss.s2.canon.runtime.IEntity;

public interface ITraceEntity extends IEntity
{
  Instant getTimestamp();
}
