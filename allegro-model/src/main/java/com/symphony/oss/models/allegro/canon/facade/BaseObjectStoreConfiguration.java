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
 *  At                  2021-01-22 15:10:43 GMT
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
import com.symphony.oss.models.allegro.canon.BaseObjectStoreConfigurationEntity;
import com.symphony.oss.models.allegro.canon.IBaseObjectStoreConfigurationEntity;

/**
 * Facade for Object ObjectSchema(BaseObjectStoreConfiguration)
 * Generated from ObjectSchema(BaseObjectStoreConfiguration) at #/components/schemas/BaseObjectStoreConfiguration
 */
@Immutable
public class BaseObjectStoreConfiguration extends BaseObjectStoreConfigurationEntity implements IBaseObjectStoreConfiguration
{
  /** Distinguished value for API url which causes Allegro to access all services individually on the local host. */
  public static final URL ALL_SERVICES_LOCAL_URL;
  
  private static final Logger                   log_                       = LoggerFactory.getLogger(BaseObjectStoreConfiguration.class);
  
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
  
  private ImmutableJsonObject redacted_;
  
  /**
   * Constructor from builder.
   * 
   * @param builder A mutable builder containing all values.
   */
  public BaseObjectStoreConfiguration(AbstractBaseObjectStoreConfigurationBuilder<?,?> builder)
  {
    super(builder);
  }
  
  /**
   * Constructor from serialised form.
   * 
   * @param jsonObject An immutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public BaseObjectStoreConfiguration(ImmutableJsonObject jsonObject, IModelRegistry modelRegistry)
  {
    super(jsonObject, modelRegistry);
  }
  
  /**
   * Constructor from mutable JSON object.
   * 
   * @param mutableJsonObject A mutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public BaseObjectStoreConfiguration(MutableJsonObject mutableJsonObject, IModelRegistry modelRegistry)
  {
    super(mutableJsonObject, modelRegistry);
  }
   
  /**
   * Copy constructor.
   * 
   * @param other Another instance from which all attributes are to be copied.
   */
  public BaseObjectStoreConfiguration(IBaseObjectStoreConfiguration other)
  {
    super(other);
  }
  
  /**
   * Abstract builder for BaseObjectStoreConfiguration. If there are sub-classes of this type then their builders sub-class this builder.
   *
   * @param <B> The concrete type of the builder, used for fluent methods.
   * @param <T> The concrete type of the built object.
   */
  public static abstract class AbstractBaseObjectStoreConfigurationBuilder<B extends AbstractBaseObjectStoreConfigurationBuilder<B,T>, T extends IBaseObjectStoreConfigurationEntity> extends AbstractBaseObjectStoreConfigurationEntityBuilder<B,T>
  {
    protected AbstractBaseObjectStoreConfigurationBuilder(Class<B> type)
    {
      super(type);
    }
    
    protected AbstractBaseObjectStoreConfigurationBuilder(Class<B> type, IBaseObjectStoreConfigurationEntity initial)
    {
      super(type, initial);
    }

    @Override
    public B withApiUrl(String value)
    {
      if("local".equals(value))
      {
          log_.info("Using local service URLS");
          return withApiUrl(ALL_SERVICES_LOCAL_URL);
      }
      else
      {
        return super.withApiUrl(value);
      }
    }
  }
  
  @Override
  public synchronized ImmutableJsonObject getRedacted()
  {
    if(redacted_ == null)
    {
      MutableJsonObject jsonObject = getJsonObject().mutify();
      
      redactJsonObject(jsonObject);
      
      redacted_ = jsonObject.immutify();
    }
    
    return redacted_;
  }

  protected void redactJsonObject(MutableJsonObject jsonObject)
  {
    if(getApiConnectionSettings() != null)
    {
        jsonObject.addIfNotNull("apiConnectionSettings", getApiConnectionSettings().getRedacted());
    }
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */