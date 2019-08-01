/**
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.system.canon.facade;

import com.symphony.oss.models.fundamental.canon.facade.IOpenExchangeKey;
import com.symphony.oss.models.fundamental.canon.facade.IOpenPrincipalCredential;
import com.symphony.oss.models.fundamental.canon.facade.IOpenSigningKey;
import com.symphony.oss.models.system.canon.facade.IPrincipal;

/**
 * An open principal with open keys and credential attached.
 * 
 * @author Bruce Skingle
 *
 */
public interface IOpenPrincipal extends IPrincipal
{
  /**
   * 
   * @return The open principal credential.
   */
  IOpenPrincipalCredential getCredential();

  /**
   * 
   * @return the open exchange key.
   */
  IOpenExchangeKey getExchangeKey();

  /**
   * 
   * @return the open signing key.
   */
  IOpenSigningKey getSigningKey();

}
