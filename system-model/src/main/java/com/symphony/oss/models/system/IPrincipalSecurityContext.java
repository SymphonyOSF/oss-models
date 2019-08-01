/*
 * Copyright 2019 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.system;

import org.symphonyoss.s2.common.hash.Hash;

import com.symphony.oss.models.fundamental.ICompoundSecurityContext;

/**
 * A (Simple) Security Context which uses an SBE user account key.
 * 
 * @author Bruce Skingle
 *
 */
public interface IPrincipalSecurityContext extends ICompoundSecurityContext
{
  /**
   * 
   * @return The principal hash for the owner of this security context.
   */
  Hash getPrincipalBaseHash();
}
