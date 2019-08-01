/*
 * Copyright 2019 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.s2.model.system;

import org.symphonyoss.s2.common.hash.Hash;

import com.symphony.oss.models.system.canon.facade.Principal;
import com.symphony.s2.model.fundamental.CompoundSecurityContext;

/**
 * A (Simple) Security Context which uses an SBE user account key.
 * 
 * @author Bruce Skingle
 *
 */
public class PrincipalSecurityContext extends CompoundSecurityContext implements IPrincipalSecurityContext
{
  private final Hash principalBaseHash_;

  /**
   * Constructor.
   * 
   * @param principalBaseHash The owner of this context.
   */
  public PrincipalSecurityContext(Hash principalBaseHash)
  {
    super(Principal.getUserSecurityContextId(principalBaseHash));
    
    principalBaseHash_ = principalBaseHash;
  }

  @Override
  public Hash getPrincipalBaseHash()
  {
    return principalBaseHash_;
  }
}
