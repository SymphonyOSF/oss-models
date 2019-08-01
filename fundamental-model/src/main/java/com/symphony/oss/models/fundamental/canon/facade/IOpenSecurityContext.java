/*
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.canon.facade;

import java.security.PrivateKey;

import com.symphony.oss.models.fundamental.canon.facade.IOpenSimpleSecurityContext;
import com.symphony.oss.models.fundamental.canon.facade.ISecurityContext;

/**
 * An open SecurityContext which has private and secret keys available.
 * 
 * @author Bruce Skingle
 *
 */
public interface IOpenSecurityContext extends IOpenSimpleSecurityContext, ISecurityContext
{
  /**
   * Return the private asymmetric key for this security context.
   * 
   * @return the private asymmetric key for this security context.
   */
  PrivateKey getPrivateKey();
}
