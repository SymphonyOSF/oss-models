/*
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.canon.facade;

import javax.crypto.SecretKey;

import org.symphonyoss.s2.canon.runtime.IEntity;
import org.symphonyoss.s2.common.immutable.ImmutableByteArray;

import com.symphony.oss.models.fundamental.canon.facade.IOpenSimpleSecurityContext;
import com.symphony.oss.models.fundamental.canon.facade.ISimpleSecurityContext;
import com.symphony.oss.models.fundamental.canon.facade.SimpleSecurityContext;
import com.symphony.oss.models.fundmental.canon.EncryptedData;

public class OpenSimpleSecurityContext extends SimpleSecurityContext implements IOpenSimpleSecurityContext
{
  private final SecretKey    secretKey_;

  public OpenSimpleSecurityContext(ISimpleSecurityContext securityContext, SecretKey secretKey)
  {
    super(securityContext);
    
    setPayloadContainer(securityContext.getPayloadContainer());
    
    secretKey_ = secretKey;
  }

  @Override
  public SecretKey getSecretKey()
  {
    return secretKey_;
  }

  @Override
  public EncryptedData encrypt(IEntity entity)
  {
    return getCipherSuite().encrypt(getSecretKey(), entity.getJsonObject().serialize());
  }

  @Override
  public ImmutableByteArray decrypt(EncryptedData cipherText)
  {
    return getCipherSuite().decrypt(getSecretKey(), cipherText);
  }
}
