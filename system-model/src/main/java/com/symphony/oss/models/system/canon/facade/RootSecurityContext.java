/*
 * Copyright 2019 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.system.canon.facade;

import java.security.PrivateKey;

import javax.crypto.SecretKey;

import com.symphony.oss.models.fundamental.canon.facade.ISecurityContext;
import com.symphony.oss.models.fundamental.canon.facade.OpenSecurityContext;

class RootSecurityContext extends OpenSecurityContext
{
  private RootSecurityContext(ISecurityContext securityContext, PrivateKey privateKey, SecretKey secretKey)
  {
    super(securityContext, privateKey, secretKey);
  }
  
  /**
   * Builder to generate new unsigned security contexts.
   * 
   * This is needed only for bootstrap security contexts for environments and tenants, hence the
   * package level access modifier.
   * 
   * @author Bruce Skingle
   *
   */
  static class UnsignedGenerator extends OpenSecurityContext.AbstractGenerator<UnsignedGenerator>
  {
    UnsignedGenerator()
    {
      super(UnsignedGenerator.class);
    }
  }
}
