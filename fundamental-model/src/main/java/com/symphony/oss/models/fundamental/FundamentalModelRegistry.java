/*
 * Copyright 2018 Symphony Communication Services, LLC.
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

package com.symphony.oss.models.fundamental;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.symphonyoss.s2.canon.runtime.IEntity;
import org.symphonyoss.s2.canon.runtime.IEntityFactory;
import org.symphonyoss.s2.canon.runtime.ModelRegistry;
import org.symphonyoss.s2.common.exception.NoSuchObjectException;
import org.symphonyoss.s2.common.fault.CodingFault;
import org.symphonyoss.s2.common.fault.TransactionFault;

import com.symphony.oss.models.fundamental.canon.facade.IBlob;
import com.symphony.oss.models.fundamental.canon.facade.IFundamentalObject;
import com.symphony.oss.models.fundamental.canon.facade.IFundamentalPayload;
import com.symphony.oss.models.fundamental.canon.facade.IOpenPrincipalCredential;
import com.symphony.oss.models.fundamental.canon.facade.IOpenSimpleSecurityContext;

public class FundamentalModelRegistry extends ModelRegistry
{
  private static final Logger log_ = LoggerFactory.getLogger(FundamentalModelRegistry.class);

  @Override
  public FundamentalModelRegistry withFactories(IEntityFactory<?, ?, ?>... factories)
  {
    super.withFactories(factories);
    
    return this;
  }

  public IEntity parseOne(Reader reader, @Nullable IOpenPrincipalCredential credential) throws IOException
  {
    IEntity existingInstance = parseOne(reader);
    
    
    if(existingInstance instanceof IFundamentalObject)
    {
      return open((IFundamentalObject) existingInstance, credential);
      
    }
    
    return existingInstance;
  }
  
  public IEntity open(IFundamentalObject existingInstance, @Nullable IOpenPrincipalCredential credential)
  {
    if(existingInstance.getPayload() == null)
      return existingInstance;
    
    IEntity payload = existingInstance.getPayload();

// why did I do this?    
//        newInstance(existingInstance.getPayload().getJsonObject());
//    
//    if(payload instanceof IFundamentalPayload)
//      ((IFundamentalPayload) payload).setPayloadContainer((IFundamentalObject)existingInstance);
    
    if(credential != null && payload instanceof IBlob)
    {
      try
      {
        return ((IBlob)payload).open(credential);
      }
      catch(IllegalArgumentException | NoSuchObjectException e)
      {
        log_.warn("Unable to open blob", e);
        return payload;
      }
    }
    
    return payload;
  }
  
  public IEntity open(IFundamentalObject existingInstance, IOpenSimpleSecurityContext securityContext)
  {
    if(existingInstance.getPayload() == null)
      return existingInstance;
    
    try
    {
      IEntity payload = newInstance(existingInstance.getPayload().getJsonObject());
      
      if(payload instanceof IFundamentalPayload)
        ((IFundamentalPayload) payload).setPayloadContainer((IFundamentalObject)existingInstance);
      
      if(payload instanceof IBlob)
      {
        return ((IBlob)payload).open(securityContext, this);
      }
      
      return payload;
    }
    catch(IllegalArgumentException e)
    {
      throw new IllegalStateException(e);
    }
  }

  public IEntity parseOne(String existing, @Nullable IOpenPrincipalCredential credential)
  {
    try(
        StringReader reader = new StringReader(existing)
        )
    {
      return parseOne(reader, credential);
    }
    catch (IOException e)
    {
      throw new CodingFault("This can't happen because the IO is all in-memory", e);
    }
  }
  
//  @SuppressWarnings("unchecked")
//  public <E extends IEntity> E parseOne(String existing, @Nullable IOpenPrincipalCredential credential, Class<E> type)
//  {
//    IEntity existingInstance = parseOne(existing, credential);
//      
//    if(type.isInstance(existingInstance))
//      return (E) existingInstance;
//
//    throw new TransactionFault("Retrieved object is of type " + existingInstance.getClass() + " not " + type);
//  }
  
//  public void verifySignature(IApplicationObject applicationObject)
//  {
//    IBlob blob = applicationObject.getBlob();
//    IFundamentalObject fundamentalObject = blob.getPayloadContainer();
//    
//    EncodedSignature s = fundamentalObject.getSignature();
//    
//    blob.getSigningKeyHash()
//  }
}
