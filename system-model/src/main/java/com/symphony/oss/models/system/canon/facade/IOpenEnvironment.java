/*
 * Copyright 2019 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.system.canon.facade;

import com.symphony.oss.models.system.canon.facade.IEnvironment;
import com.symphony.oss.models.system.canon.facade.IOpenPrincipal;

/**
 * An open environment.
 * 
 * @author Bruce Skingle
 *
 */
public interface IOpenEnvironment extends IEnvironment
{
  /**
   * 
   * @return The environment operating principal.
   */
  IOpenPrincipal getOperatingPrincipal();
}
