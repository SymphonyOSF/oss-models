/*
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.canon.facade;

import org.symphonyoss.s2.canon.runtime.IEntity;

import com.symphony.oss.models.fundamental.canon.facade.INotification;

/**
 * A Notification with an opened payload.
 * 
 * @author Bruce Skingle
 *
 */
public interface IOpenNotification extends INotification
{
  /**
   * @return The payload of the Notification which has been deserialized, opened and decrypted if possible.
   */
  IEntity getEntity();
}
