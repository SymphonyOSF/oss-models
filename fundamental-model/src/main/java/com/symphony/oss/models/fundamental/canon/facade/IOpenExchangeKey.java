/*
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.canon.facade;

import javax.crypto.SecretKey;

import com.symphony.oss.models.fundamental.canon.facade.IExchangeKey;
import com.symphony.oss.models.fundamental.canon.facade.IOpenPublicKey;
import com.symphony.oss.models.fundamental.canon.facade.WrappedKey;
import com.symphony.oss.models.fundamental.crypto.cipher.ISymmetricCipherSuite;

/**
 * An open exchange key, i.e. an object containing the matching private key for the public key contained
 * in the super-class.
 * 
 * This object can be used to unwrap other keys.
 * 
 * @author Bruce Skingle
 *
 */
public interface IOpenExchangeKey extends IOpenPublicKey, IExchangeKey
{
  /**
   * Unwrap the given wrapped secret key.
   * 
   * @param wrappedKey              A wrapped secret key.
   * @param wrappedKeyCipherSuite   The CipherSuite of the given wrapped key/
   * 
   * @return The unwrapped secret key.
   */
  SecretKey unwrap(WrappedKey wrappedKey, ISymmetricCipherSuite wrappedKeyCipherSuite);

}
