/*
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.canon.facade;

import javax.crypto.SecretKey;

import org.symphonyoss.s2.canon.runtime.IEntity;
import org.symphonyoss.s2.common.immutable.ImmutableByteArray;

import com.symphony.oss.models.fundamental.canon.facade.ISimpleSecurityContext;
import com.symphony.oss.models.fundamental.crypto.cipher.ICipherSuite;
import com.symphony.oss.models.fundmental.canon.EncryptedData;

/**
 * An open SecurityContext which has private and secret keys available.
 * 
 * @author Bruce Skingle
 *
 */
public interface IOpenSimpleSecurityContext extends ISimpleSecurityContext
{
  /**
   * Return the secret symmetric key for this security context.
   * 
   * @return the secret symmetric key for this security context.
   */
  SecretKey getSecretKey();

  EncryptedData encrypt(IEntity entity);

  ImmutableByteArray decrypt(EncryptedData cipherText);

  /**
   * 
   * @return The cipher suite for the secret key.
   */
  ICipherSuite getCipherSuite();

}
