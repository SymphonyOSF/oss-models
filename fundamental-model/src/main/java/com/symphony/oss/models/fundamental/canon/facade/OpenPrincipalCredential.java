/*
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.canon.facade;

import org.symphonyoss.s2.canon.runtime.IModelRegistry;

import com.symphony.oss.models.fundamental.store.IFundamentalDatabaseReadOnly;
import com.symphony.oss.models.fundamental.canon.facade.IOpenExchangeKey;
import com.symphony.oss.models.fundamental.canon.facade.IOpenPrincipalCredential;
import com.symphony.oss.models.fundamental.canon.facade.IOpenSigningKey;
import com.symphony.oss.models.fundamental.canon.facade.IPrincipalCredential;
import com.symphony.oss.models.fundamental.canon.facade.PrincipalCredential;

public class OpenPrincipalCredential extends PrincipalCredential implements IOpenPrincipalCredential
{
  private final IOpenExchangeKey                   exchangeKey_;
  private final IOpenSigningKey                    signingKey_;
  private final IFundamentalDatabaseReadOnly database_;
  private final IModelRegistry                     modelRegistry_;

  public OpenPrincipalCredential(IPrincipalCredential principalCredential, IOpenExchangeKey exchangeKey,
      IOpenSigningKey signingKey,
      IFundamentalDatabaseReadOnly database, IModelRegistry modelRegistry)
  {
    super(principalCredential);
    
    exchangeKey_ = exchangeKey;
    signingKey_ = signingKey;
    database_ = database;
    modelRegistry_ = modelRegistry;
  }

  @Override
  public IOpenExchangeKey getExchangeKey()
  {
    return exchangeKey_;
  }

  @Override
  public IOpenSigningKey getSigningKey()
  {
    return signingKey_;
  }

  @Override
  public IFundamentalDatabaseReadOnly getDatabase()
  {
    return database_;
  }

  @Override
  public IModelRegistry getModelRegistry()
  {
    return modelRegistry_;
  }
}
