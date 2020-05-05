/**
 * Copyright 2020 Symphony Communication Services, LLC.
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
 *  At                  2020-01-27 13:01:50 GMT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.allegro.canon.facade;

import javax.annotation.concurrent.Immutable;

import java.util.List;

import com.symphony.oss.models.allegro.canon.ReceivedMaestroMessageEntity;
import com.symphony.oss.models.chat.canon.IMaestroMessage;
import com.symphony.oss.models.allegro.canon.IReceivedMaestroMessageEntity;
import com.symphony.oss.canon.runtime.IEntity;
import com.symphony.oss.canon.runtime.IModelRegistry;
import com.symphony.oss.commons.dom.json.ImmutableJsonObject;
import com.symphony.oss.commons.dom.json.MutableJsonObject;
import com.symphony.oss.commons.immutable.ImmutableByteArray;
import com.symphony.oss.models.allegro.canon.AllegroModel;

/**
 * Facade for Object ObjectSchema(ReceivedMaestroMessage)
 * Generated from ObjectSchema(ReceivedMaestroMessage) at #/components/schemas/ReceivedMaestroMessage
 */
@Immutable
@SuppressWarnings("unused")
public class ReceivedMaestroMessage extends ReceivedMaestroMessageEntity implements IReceivedMaestroMessage
{
  /**
   * Constructor from builder.
   * 
   * @param builder A mutable builder containing all values.
   */
  public ReceivedMaestroMessage(AbstractReceivedMaestroMessageBuilder<?,?> builder)
  {
    super(builder);
  }
  
  /**
   * Constructor from serialised form.
   * 
   * @param jsonObject An immutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public ReceivedMaestroMessage(ImmutableJsonObject jsonObject, IModelRegistry modelRegistry)
  {
    super(jsonObject, modelRegistry);
  }
  
  /**
   * Constructor from mutable JSON object.
   * 
   * @param mutableJsonObject A mutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public ReceivedMaestroMessage(MutableJsonObject mutableJsonObject, IModelRegistry modelRegistry)
  {
    super(mutableJsonObject, modelRegistry);
  }
   
  /**
   * Copy constructor.
   * 
   * @param other Another instance from which all attributes are to be copied.
   */
  public ReceivedMaestroMessage(IReceivedMaestroMessage other)
  {
    super(other);
  }
  
  @Override
  public IMaestroMessage getLiveCurrentMessage()
  {
    return getMaestroMessage();
  }

  /**
   * Abstract builder for ReceivedMaestroMessage. If there are sub-classes of this type then their builders sub-class this builder.
   *
   * @param <B> The concrete type of the builder, used for fluent methods.
   * @param <T> The concrete type of the built object.
   */
  public static abstract class AbstractReceivedMaestroMessageBuilder<B extends AbstractReceivedMaestroMessageBuilder<B,T>, T extends IReceivedMaestroMessageEntity> extends AbstractReceivedMaestroMessageEntityBuilder<B,T>
  {
    protected AbstractReceivedMaestroMessageBuilder(Class<B> type)
    {
      super(type);
    }
    
    protected AbstractReceivedMaestroMessageBuilder(Class<B> type, IReceivedMaestroMessageEntity initial)
    {
      super(type, initial);
    }
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */