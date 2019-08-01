/*
 *
 *
 * Copyright 2017 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.s2.model.fundamental.crypto.cipher;

/**
 * A CipherSuite compatibility exception.
 * Caused by using the wrong type of key with an operation for example.
 * 
 * @author Bruce Skingle
 *
 */
public class CipherSuiteMismatchException extends CipherSuiteException
{
  private static final long serialVersionUID = 1L;

  public CipherSuiteMismatchException()
  {
  }

  public CipherSuiteMismatchException(String message)
  {
    super(message);
  }

  public CipherSuiteMismatchException(Throwable cause)
  {
    super(cause);
  }

  public CipherSuiteMismatchException(String message, Throwable cause)
  {
    super(message, cause);
  }

  public CipherSuiteMismatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
  {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
