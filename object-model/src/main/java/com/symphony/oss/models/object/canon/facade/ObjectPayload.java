/**
 * Copyright 2019 Symphony Communication Services, LLC.
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
 *  At                  2019-11-29 11:39:41 GMT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.object.canon.facade;

import java.time.Instant;

import javax.annotation.concurrent.Immutable;

import org.symphonyoss.s2.canon.runtime.IModelRegistry;
import org.symphonyoss.s2.common.dom.json.ImmutableJsonObject;
import org.symphonyoss.s2.common.dom.json.MutableJsonObject;
import org.symphonyoss.s2.common.hash.Hash;

import com.symphony.oss.models.object.canon.IObjectPayloadEntity;
import com.symphony.oss.models.object.canon.ObjectPayloadEntity;

/**
 * Facade for Object ObjectSchema(ObjectPayload)
 *
 * Base type for application objects in the object store.
 * Generated from ObjectSchema(ObjectPayload) at #/components/schemas/ObjectPayload
 */
@Immutable
public class ObjectPayload extends ObjectPayloadEntity implements IObjectPayload
{
  /**
   * Constructor from builder.
   * 
   * @param builder A mutable builder containing all values.
   */
  public ObjectPayload(AbstractObjectPayloadBuilder<?,?> builder)
  {
    super(builder);
  }
  
  /**
   * Constructor from serialised form.
   * 
   * @param jsonObject An immutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public ObjectPayload(ImmutableJsonObject jsonObject, IModelRegistry modelRegistry)
  {
    super(jsonObject, modelRegistry);
  }
  
  /**
   * Constructor from mutable JSON object.
   * 
   * @param mutableJsonObject A mutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public ObjectPayload(MutableJsonObject mutableJsonObject, IModelRegistry modelRegistry)
  {
    super(mutableJsonObject, modelRegistry);
  }
   
  /**
   * Copy constructor.
   * 
   * @param other Another instance from which all attributes are to be copied.
   */
  public ObjectPayload(IObjectPayload other)
  {
    super(other);
  }
  
  @Override
  public Hash getBaseHash()
  {
    if(super.getBaseHash() == null)
      return getAbsoluteHash();
    
    return super.getBaseHash();
  }
  
  /**
   * 
   * @return True iff this is a base object (the initial version of an object for a given baseHash)
   */
  public boolean isBaseObject()
  {
    return super.getBaseHash() == null;
  }

  /**
   * Abstract builder for ObjectPayload. If there are sub-classes of this type then their builders sub-class this builder.
   *
   * @param <B> The concrete type of the builder, used for fluent methods.
   * @param <T> The concrete type of the built object.
   */
  public static abstract class AbstractObjectPayloadBuilder<B extends AbstractObjectPayloadBuilder<B,T>, T extends IObjectPayloadEntity> extends AbstractObjectPayloadEntityBuilder<B,T>
  {
    protected AbstractObjectPayloadBuilder(Class<B> type)
    {
      super(type);
    }
    
    protected AbstractObjectPayloadBuilder(Class<B> type, IObjectPayloadEntity initial)
    {
      super(type, initial);
    }

    @Override
    public Instant getCreatedDate()
    {
      if(super.getCreatedDate() == null)
         return Instant.now();
      
      return super.getCreatedDate();
    }
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */