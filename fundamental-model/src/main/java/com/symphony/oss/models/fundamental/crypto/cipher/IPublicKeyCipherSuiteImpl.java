/*
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.crypto.cipher;

import java.security.PrivateKey;

import javax.crypto.SecretKey;

import com.symphony.oss.models.fundamental.canon.facade.WrappedKey;

/**
 * Implementation of a public key cipher, these methods are not inherited by ICipherSuite.
 * 
 * @author bruce.skingle
 *
 */
public interface IPublicKeyCipherSuiteImpl extends IPublicKeyCipherSuite
{
  /**
   * Unwrap the given encrypted SecretKey
   * 
   * @param wrappedKey        Encrypted key to be unwrapped.
   * @param userPrivateKey      Wrapping key.
   * @param symmetricCipherSuite    Wrapping cipherSuite
   * @return  The SecretKey.
   * 
   * @throws IllegalArgumentException
   */
  SecretKey unwrap(WrappedKey wrappedKey, PrivateKey userPrivateKey, ISymmetricCipherSuite symmetricCipherSuite);
}
