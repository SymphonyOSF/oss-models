/*
 * Copyright 2019 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.canon.facade;

import com.symphony.oss.models.fundamental.canon.facade.PodAndUserId;

/**
 * A function to map user IDs from internal to external.
 * 
 * @author Bruce Skingle
 *
 */
@FunctionalInterface
public interface IUserIdFunction
{
  /**
   * Map the given internal or external user ID to its external form.
   * 
   * @param userId A user ID
   * @return The external form of that user ID.
   */
  PodAndUserId map(PodAndUserId userId);
}
