/*
 *
 *
 * Copyright 2017 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.s2.model.fundamental.crypto.cipher;

/**
 * The requested CipherSuite does not exist.
 * 
 * @author Bruce Skingle
 *
 */
public class UnknownCipherSuiteException extends CipherSuiteException
{
  private static final long serialVersionUID = 1L;

  public UnknownCipherSuiteException()
  {
    super();
  }

  public UnknownCipherSuiteException(String message, Throwable cause)
  {
    super(message, cause);
  }

  public UnknownCipherSuiteException(String message)
  {
    super(message);
  }

  public UnknownCipherSuiteException(Throwable cause)
  {
    super(cause);
  }

}
