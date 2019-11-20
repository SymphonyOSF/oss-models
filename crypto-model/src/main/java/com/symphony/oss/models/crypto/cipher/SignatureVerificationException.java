/*
 * Copyright 2016-2017  Symphony Communication Services, LLC.
 * 
 * Includes public domain material developed by Immutify Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.symphony.oss.models.crypto.cipher;

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
