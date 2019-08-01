/*
 *
 *
 * Copyright 2017 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.s2.model.fundamental.crypto.cipher;

/**
 * A general CipherSuite exception.
 * 
 * @author Bruce Skingle
 *
 */
public class CipherSuiteException extends Exception
{
  private static final long serialVersionUID = 1L;

  public CipherSuiteException()
  {
  }

  public CipherSuiteException(String message)
  {
    super(message);
  }

  public CipherSuiteException(Throwable cause)
  {
    super(cause);
  }

  public CipherSuiteException(String message, Throwable cause)
  {
    super(message, cause);
  }

  public CipherSuiteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
  {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
