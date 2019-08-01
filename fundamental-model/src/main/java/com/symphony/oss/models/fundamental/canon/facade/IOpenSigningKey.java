/*
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.canon.facade;

import org.symphonyoss.s2.canon.runtime.IEntity;

import com.symphony.oss.models.fundamental.canon.facade.IOpenPublicKey;
import com.symphony.oss.models.fundamental.canon.facade.ISigningKey;
import com.symphony.oss.models.fundmental.canon.EncodedSignature;
import com.symphony.oss.models.fundmental.canon.EncryptedData;

/**
 * An open signing key, i.e. an object containing the matching private key for the public key contained
 * in the super-class.
 * 
 * This object can be used to create signatures.
 * 
 * @author Bruce Skingle
 *
 */
public interface IOpenSigningKey extends IOpenPublicKey, ISigningKey
{
  /**
   * Sign the given encrypted payload.
   * 
   * @param payload An encrypted payload.
   * 
   * @return A signature of the given payload.
   */
  EncodedSignature sign(EncryptedData payload);
  
  /**
   * Sign the given entity payload.
   * 
   * @param payload An entity payload.
   * 
   * @return A signature of the given payload.
   */
  EncodedSignature sign(IEntity payload);
}
