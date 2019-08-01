/*
 * Copyright 2016-2017  Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.crypto.cipher;

public class NoSuchCipherSuiteException extends Exception
{
	private static final long	serialVersionUID	= 1L;

	public NoSuchCipherSuiteException()
	{
	}

	public NoSuchCipherSuiteException(String message)
	{
		super(message);
	}

	public NoSuchCipherSuiteException(Throwable cause)
	{
		super(cause);
	}

	public NoSuchCipherSuiteException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
