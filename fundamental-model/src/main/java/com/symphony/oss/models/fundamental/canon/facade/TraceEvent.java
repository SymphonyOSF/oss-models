/**
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 *
 *----------------------------------------------------------------------------------------------------
 * Proforma generated from
 *		Template groupId		 org.symphonyoss.s2.canon
 *           artifactId canon-template-java
 *		Template name		   proforma/java/Object/_.java.ftl
 *		Template version	   1.0
 *  At                  2018-03-21 10:45:00 GMT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.fundamental.canon.facade;

import javax.annotation.concurrent.Immutable;

import org.symphonyoss.s2.canon.runtime.IModelRegistry;
import org.symphonyoss.s2.common.dom.json.ImmutableJsonObject;
import org.symphonyoss.s2.common.dom.json.MutableJsonObject;

import com.symphony.oss.models.fundamental.canon.facade.ITraceEvent;
import com.symphony.oss.models.fundamental.canon.facade.TraceEvent;
import com.symphony.oss.models.fundmental.canon.TraceEventEntity;

/**
 * Facade for Object ObjectSchema(TraceEvent)
 * Generated from ObjectSchema(TraceEvent) at #/components/schemas/TraceEvent
 */
@Immutable
public class TraceEvent extends TraceEventEntity implements ITraceEvent, Comparable<TraceEvent>
{

  /**
   * Constructor from builder.
   * 
   * @param builder A mutable builder containing all values.
   */
  public TraceEvent(AbstractTraceEventBuilder<?,?> builder)
  {
    super(builder);
  }
  
  /**
   * Constructor from serialised form.
   * 
   * @param jsonObject An immutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public TraceEvent(ImmutableJsonObject jsonObject, IModelRegistry modelRegistry)
  {
    super(jsonObject, modelRegistry);
  }
  
  /**
   * Constructor from mutable JSON object.
   * 
   * @param mutableJsonObject A mutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public TraceEvent(MutableJsonObject mutableJsonObject, IModelRegistry modelRegistry)
  {
    super(mutableJsonObject, modelRegistry);
  }

  @Override
  public int compareTo(TraceEvent o)
  {
    int c = getTimestamp().compareTo(o.getTimestamp());
    
    if(c == 0)
      c = toString().compareTo(o.toString());
    
    return c;
  }
}/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */