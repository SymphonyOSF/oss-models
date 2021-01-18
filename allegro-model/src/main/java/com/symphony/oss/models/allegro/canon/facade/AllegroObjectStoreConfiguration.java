/**
 * Copyright 2021 Symphony Communication Services, LLC.
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
 *
 *----------------------------------------------------------------------------------------------------
 * Proforma generated from
 *		Template groupId		 org.symphonyoss.s2.canon
 *           artifactId canon-template-java
 *		Template name		   proforma/java/Object/_.java.ftl
 *		Template version	   1.0
 *  At                  2021-01-15 13:51:09 GMT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.allegro.canon.facade;

import java.net.MalformedURLException;
import java.net.URL;

import javax.annotation.concurrent.Immutable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.symphony.oss.canon.runtime.IModelRegistry;
import com.symphony.oss.commons.dom.json.ImmutableJsonObject;
import com.symphony.oss.commons.dom.json.MutableJsonObject;
import com.symphony.oss.commons.fault.CodingFault;
import com.symphony.oss.models.allegro.canon.AllegroObjectStoreConfigurationEntity;
import com.symphony.oss.models.allegro.canon.IAllegroObjectStoreConfigurationEntity;

/**
 * Facade for Object ObjectSchema(AllegroObjectStoreConfiguration)
 * Generated from ObjectSchema(AllegroObjectStoreConfiguration) at #/components/schemas/AllegroObjectStoreConfiguration
 */
@Immutable
public class AllegroObjectStoreConfiguration extends AllegroObjectStoreConfigurationEntity implements IAllegroObjectStoreConfiguration
{
  /** Distinguished value for API url which causes Allegro to access all services individually on the local host. */
  public static final URL ALL_SERVICES_LOCAL_URL;
  
  private static final Logger                   log_                       = LoggerFactory.getLogger(AllegroObjectStoreConfiguration.class);
  
  static
  {
    try
    {
      ALL_SERVICES_LOCAL_URL = new URL("http://local");
    }
    catch (MalformedURLException e)
    {
      throw new CodingFault(e);
    }
  }
  
  /**
   * Constructor from builder.
   * 
   * @param builder A mutable builder containing all values.
   */
  public AllegroObjectStoreConfiguration(AbstractAllegroObjectStoreConfigurationBuilder<?,?> builder)
  {
    super(builder);
  }
  
  /**
   * Constructor from serialised form.
   * 
   * @param jsonObject An immutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public AllegroObjectStoreConfiguration(ImmutableJsonObject jsonObject, IModelRegistry modelRegistry)
  {
    super(jsonObject, modelRegistry);
  }
  
  /**
   * Constructor from mutable JSON object.
   * 
   * @param mutableJsonObject A mutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public AllegroObjectStoreConfiguration(MutableJsonObject mutableJsonObject, IModelRegistry modelRegistry)
  {
    super(mutableJsonObject, modelRegistry);
  }
   
  /**
   * Copy constructor.
   * 
   * @param other Another instance from which all attributes are to be copied.
   */
  public AllegroObjectStoreConfiguration(IAllegroObjectStoreConfiguration other)
  {
    super(other);
  }
  
  /**
   * Abstract builder for AllegroObjectStoreConfiguration. If there are sub-classes of this type then their builders sub-class this builder.
   *
   * @param <B> The concrete type of the builder, used for fluent methods.
   * @param <T> The concrete type of the built object.
   */
  public static abstract class AbstractAllegroObjectStoreConfigurationBuilder<B extends AbstractAllegroObjectStoreConfigurationBuilder<B,T>, T extends IAllegroObjectStoreConfigurationEntity> extends AbstractAllegroObjectStoreConfigurationEntityBuilder<B,T>
  {
    protected AbstractAllegroObjectStoreConfigurationBuilder(Class<B> type)
    {
      super(type);
    }
    
    protected AbstractAllegroObjectStoreConfigurationBuilder(Class<B> type, IAllegroObjectStoreConfigurationEntity initial)
    {
      super(type, initial);
    }

    @Override
    public B withApiUrl(String objectStoreUrl)
    {
      switch(objectStoreUrl)
      {
        case "local":
          log_.info("Using local service URLS");
          return super.withApiUrl(ALL_SERVICES_LOCAL_URL);
        
        default:
          return super.withApiUrl(objectStoreUrl);
      }
      
    }
  }
  
  @Override
  protected void redactJsonObject(MutableJsonObject jsonObject)
  {
    super.redactJsonObject(jsonObject);
    
    if(getApiConnectionSettings() != null)
    {
        jsonObject.addIfNotNull("apiConnectionSettings", getApiConnectionSettings().getRedacted());
    }
    
    if(getPrincipalCredential() != null)
    {
      jsonObject.addIfNotNull("principalCredential", getPrincipalCredential().getRedacted());
    }
    
    if(getRsaPemCredential() != null)
    {
      jsonObject.addIfNotNull("rsaPemCredential", ConnectionSettings.REDACTED);
    }
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */