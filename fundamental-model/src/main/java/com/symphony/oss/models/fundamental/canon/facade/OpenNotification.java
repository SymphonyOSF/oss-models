/*
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.canon.facade;

import org.symphonyoss.s2.canon.runtime.IEntity;

import com.symphony.oss.models.fundamental.canon.facade.INotification;
import com.symphony.oss.models.fundamental.canon.facade.IOpenNotification;
import com.symphony.oss.models.fundamental.canon.facade.Notification;

public class OpenNotification extends Notification implements IOpenNotification
{
  private final IEntity entity_;

  public OpenNotification(INotification other, IEntity entity)
  {
    super(other);
    entity_ = entity;
  }

  @Override
  public IEntity getEntity()
  {
    return entity_;
  }

}
