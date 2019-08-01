/*
 * Copyright 2016-2017  Symphony Communication Services, LLC.
 * 
 * Includes public domain material developed by Immutify Limited.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.crypto.cipher;

public class SignatureVerificationException extends Exception
{
	private static final long	serialVersionUID	= 1L;

	public SignatureVerificationException(String message)
	{
		super(message);
	}

	public SignatureVerificationException(Throwable cause)
	{
		super(cause);
	}

	public SignatureVerificationException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public SignatureVerificationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
