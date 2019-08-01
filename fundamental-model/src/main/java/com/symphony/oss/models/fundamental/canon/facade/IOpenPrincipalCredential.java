/*
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.canon.facade;

import org.symphonyoss.s2.canon.runtime.IModelRegistry;

import com.symphony.oss.models.fundamental.store.IFundamentalDatabaseReadOnly;
import com.symphony.oss.models.fundamental.canon.facade.IOpenExchangeKey;
import com.symphony.oss.models.fundamental.canon.facade.IOpenSigningKey;
import com.symphony.oss.models.fundamental.canon.facade.IPrincipalCredential;

public interface IOpenPrincipalCredential extends IPrincipalCredential
{

  IOpenExchangeKey getExchangeKey();

  IOpenSigningKey getSigningKey();

  IFundamentalDatabaseReadOnly getDatabase();

  IModelRegistry getModelRegistry();

}
