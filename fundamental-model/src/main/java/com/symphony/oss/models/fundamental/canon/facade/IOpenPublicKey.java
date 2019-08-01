/*
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.canon.facade;

import java.security.PrivateKey;

import com.symphony.oss.models.fundamental.canon.facade.IAbstractPublicKey;
import com.symphony.oss.models.fundmental.canon.PemPrivateKey;

/**
 * An open public key, i.e. an object containing the matching private key for the public key contained
 * in the super-class.
 * 
 * @author Bruce Skingle
 *
 */
public interface IOpenPublicKey extends IAbstractPublicKey
{
  /**
   * Return the private key for this public key.
   * 
   * @return The private key for this public key.
   */
  PrivateKey getPrivateKey();

  /**
   * 
   * @return The private key in PEM format.
   */
  PemPrivateKey getEncodedPrivateKey();
}
