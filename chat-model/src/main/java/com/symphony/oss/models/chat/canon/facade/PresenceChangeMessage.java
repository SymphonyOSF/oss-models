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
 *  At                  2019-08-03 12:52:47 GMT-07:00
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.chat.canon.facade;

import javax.annotation.concurrent.Immutable;

import com.symphony.oss.canon.runtime.IModelRegistry;
import com.symphony.oss.commons.dom.json.ImmutableJsonObject;
import com.symphony.oss.commons.dom.json.MutableJsonObject;
import com.symphony.oss.models.chat.canon.PresenceChangeMessageEntity;
import com.symphony.oss.models.core.canon.facade.TimeStamp;

/**
 * Facade for Object ObjectSchema(PresenceChangeMessage)
 *
 * A PresenceV1 livecurrent message.
 * Generated from ObjectSchema(PresenceChangeMessage) at #/components/schemas/PresenceChangeMessage
 */
@Immutable
public class PresenceChangeMessage extends PresenceChangeMessageEntity implements IPresenceChangeMessage
{
  /**
   * Constructor from builder.
   * 
   * @param builder A mutable builder containing all values.
   */
  public PresenceChangeMessage(AbstractPresenceChangeMessageBuilder<?,?> builder)
  {
    super(builder);
  }
  
  /**
   * Constructor from serialised form.
   * 
   * @param jsonObject An immutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public PresenceChangeMessage(ImmutableJsonObject jsonObject, IModelRegistry modelRegistry)
  {
    super(jsonObject, modelRegistry);
  }
  
  /**
   * Constructor from mutable JSON object.
   * 
   * @param mutableJsonObject A mutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public PresenceChangeMessage(MutableJsonObject mutableJsonObject, IModelRegistry modelRegistry)
  {
    super(mutableJsonObject, modelRegistry);
  }
   
  /**
   * Copy constructor.
   * 
   * @param other Another instance from which all attributes are to be copied.
   */
  public PresenceChangeMessage(IPresenceChangeMessage other)
  {
    super(other);
  }

  @Override
  public TimeStamp getIngestionDate()
  {
    // SBE does not set the ingestion date on V1PresenceChange messages. sigh.
    
    TimeStamp ingestionDate = super.getIngestionDate();
    
    if(ingestionDate == null)
      ingestionDate = getTimestamp();
    
    return ingestionDate;
  }
  
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */