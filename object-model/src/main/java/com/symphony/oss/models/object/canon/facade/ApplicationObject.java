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
 *  At                  2019-11-29 17:08:16 GMT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.object.canon.facade;

import javax.annotation.concurrent.Immutable;

import org.symphonyoss.s2.canon.runtime.IModelRegistry;
import org.symphonyoss.s2.common.dom.json.ImmutableJsonObject;

import com.symphony.oss.models.object.canon.ApplicationObjectEntity;
import com.symphony.oss.models.object.canon.IApplicationObjectEntity;

/**
 * Facade for Object ObjectSchema(ApplicationObject)
 *
 * Base type for header or encrypted payloads in the object store.
 * Generated from ObjectSchema(ApplicationObject) at #/components/schemas/ApplicationObject
 */
@Immutable
public class ApplicationObject extends ApplicationObjectEntity implements IApplicationObject
{
  private final IStoredApplicationObject storedApplicationObject_;
  
  /**
   * Constructor from builder.
   * 
   * @param builder A mutable builder containing all values.
   */
  public ApplicationObject(AbstractApplicationObjectBuilder<?,?> builder)
  {
    super(builder);
    storedApplicationObject_ = builder.storedApplicationObject_;
  }
  
  /**
   * Return a new entity instance created from the given JSON serialization.
   * 
   * @param jsonObject The JSON serialized form of the required entity.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public ApplicationObject(ImmutableJsonObject jsonObject, IModelRegistry modelRegistry)
  {
    super(jsonObject, modelRegistry);
    
    storedApplicationObject_ = null;
  }

  /**
   * 
   * @return The encrypted form of this object.
   */
  public IStoredApplicationObject getStoredApplicationObject()
  {
    return storedApplicationObject_;
  }

  /**
   * Abstract builder for ApplicationObject. If there are sub-classes of this type then their builders sub-class this builder.
   *
   * @param <B> The concrete type of the builder, used for fluent methods.
   * @param <T> The concrete type of the built object.
   */
  public static abstract class AbstractApplicationObjectBuilder<B extends AbstractApplicationObjectBuilder<B,T>, T extends IApplicationObjectEntity> extends AbstractApplicationObjectEntityBuilder<B,T>
  {
    private IStoredApplicationObject storedApplicationObject_;
    
    protected AbstractApplicationObjectBuilder(Class<B> type)
    {
      super(type);
    }
    
    protected AbstractApplicationObjectBuilder(Class<B> type, IApplicationObjectEntity initial)
    {
      super(type, initial);
    }
    
    /**
     * Set the StoredApplicationObject.
     * 
     * @param storedApplicationObject The StoredApplicationObject.
     * 
     * @return This (fluent method)
     */
    public B withStoredApplicationObject(IStoredApplicationObject storedApplicationObject)
    {
      storedApplicationObject_ = storedApplicationObject;
      
      return self();
    }
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */