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
 *  At                  2021-01-25 13:32:39 GMT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.allegro.canon.facade;

import javax.annotation.concurrent.Immutable;

import com.symphony.oss.commons.immutable.ImmutableByteArray;

import com.symphony.oss.commons.dom.json.ImmutableJsonObject;
import com.symphony.oss.commons.dom.json.MutableJsonObject;

import com.symphony.oss.canon.runtime.IEntity;
import com.symphony.oss.canon.runtime.IModelRegistry;


import com.symphony.oss.models.allegro.canon.AllegroObjectStoreConfigurationEntity;
import com.symphony.oss.models.allegro.canon.IAllegroObjectStoreConfigurationEntity;
import com.symphony.oss.models.allegro.canon.AllegroModel;

/**
 * Facade for Object ObjectSchema(AllegroObjectStoreConfiguration)
 * Generated from ObjectSchema(AllegroObjectStoreConfiguration) at #/components/schemas/AllegroObjectStoreConfiguration
 */
@Immutable
@SuppressWarnings("unused")
public class AllegroObjectStoreConfiguration extends AllegroObjectStoreConfigurationEntity implements IAllegroObjectStoreConfiguration
{
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
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */