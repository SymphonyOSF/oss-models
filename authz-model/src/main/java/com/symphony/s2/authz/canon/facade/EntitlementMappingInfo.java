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
 *  At                  2020-09-08 17:49:53 CEST
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.s2.authz.canon.facade;

import javax.annotation.concurrent.Immutable;

import com.symphony.oss.commons.immutable.ImmutableByteArray;
import com.symphony.oss.fugue.kv.IKvPartitionKey;
import com.symphony.oss.fugue.kv.IKvSortKey;
import com.symphony.oss.fugue.store.IFuguePodId;
import com.symphony.oss.commons.dom.json.ImmutableJsonObject;
import com.symphony.oss.commons.dom.json.MutableJsonObject;

import com.symphony.oss.canon.runtime.IEntity;
import com.symphony.oss.canon.runtime.IModelRegistry;

import java.time.Instant;
import com.symphony.oss.models.core.canon.facade.InstantBuilder;

import com.symphony.s2.authz.canon.EntitlementMappingInfoEntity;
import com.symphony.s2.authz.canon.IEntitlementMappingInfoEntity;
import com.symphony.s2.authz.canon.AuthzModel;

/**
 * Facade for Object ObjectSchema(EntitlementMappingInfo)
 *
 * An entitlement definition.
 * Generated from ObjectSchema(EntitlementMappingInfo) at #/components/schemas/EntitlementMappingInfo
 */
@Immutable
@SuppressWarnings("unused")
public class EntitlementMappingInfo extends EntitlementMappingInfoEntity implements IEntitlementMappingInfo
{
  /**
   * Constructor from builder.
   * 
   * @param builder A mutable builder containing all values.
   */
  public EntitlementMappingInfo(AbstractEntitlementMappingInfoBuilder<?,?> builder)
  {
    super(builder);
  }
  
  /**
   * Constructor from serialised form.
   * 
   * @param jsonObject An immutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public EntitlementMappingInfo(ImmutableJsonObject jsonObject, IModelRegistry modelRegistry)
  {
    super(jsonObject, modelRegistry);
  }
  
  /**
   * Constructor from mutable JSON object.
   * 
   * @param mutableJsonObject A mutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public EntitlementMappingInfo(MutableJsonObject mutableJsonObject, IModelRegistry modelRegistry)
  {
    super(mutableJsonObject, modelRegistry);
  }
   
  /**
   * Copy constructor.
   * 
   * @param other Another instance from which all attributes are to be copied.
   */
  public EntitlementMappingInfo(IEntitlementMappingInfo other)
  {
    super(other);
  }
  
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */