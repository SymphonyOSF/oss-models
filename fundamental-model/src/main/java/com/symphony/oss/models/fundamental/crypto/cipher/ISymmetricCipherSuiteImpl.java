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
 * Implementation of a symmetric key cipher, these methods are not inherited by ICipherSuite.
 * 
 * @author bruce.skingle
 *
 */
public interface ISymmetricCipherSuiteImpl extends ISymmetricCipherSuite
{
  /**
   * Unwrap the given encrypted PrivateKey
   * 
   * @param wrappedKey        Encrypted key to be unwrapped.
   * @param userKey         Wrapping key.
   * @param cipherSuite       Wrapping cipherSuite
   * @return  The SecretKey.
   * 
   * @throws NullPointerException if any of the arguments are null.
   * @throws IllegalArgumentException if the key is invalid and encryption fails.
   */
  PrivateKey unwrap(WrappedKey wrappedKey, SecretKey userKey, IPublicKeyCipherSuite cipherSuite);
}
