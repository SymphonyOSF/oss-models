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
 *  At                  2019-11-25 09:18:48 GMT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.object.canon.facade;

import javax.annotation.concurrent.Immutable;

import org.symphonyoss.s2.canon.runtime.IModelRegistry;
import org.symphonyoss.s2.common.dom.json.ImmutableJsonObject;
import org.symphonyoss.s2.common.dom.json.MutableJsonObject;
import org.symphonyoss.s2.common.hash.Hash;
import org.symphonyoss.s2.common.hash.HashProvider;
import org.symphonyoss.s2.fugue.kv.IKvPartitionKey;
import org.symphonyoss.s2.fugue.kv.IKvSortKey;
import org.symphonyoss.s2.fugue.kv.KvPartitionKey;
import org.symphonyoss.s2.fugue.kv.KvSortKey;
import org.symphonyoss.s2.fugue.store.IFuguePodId;

import com.symphony.oss.models.object.canon.KvItemEntity;

/**
 * Facade for Object ObjectSchema(KvItem)
 *
 * Base type for objects in the  object store.
 * Generated from ObjectSchema(KvItem) at #/components/schemas/KvItem
 */
@Immutable
public class KvItem extends KvItemEntity implements IKvItem
{
  
  private final Hash            absoluteHash_;
  private final IKvPartitionKey kvPartitionKey_;
  private final IKvSortKey      kvSortKey_;

  /**
   * Constructor from builder.
   * 
   * @param builder A mutable builder containing all values.
   */
  public KvItem(AbstractKvItemBuilder<?,?> builder)
  {
    super(builder);
    absoluteHash_ = generateHash();
    kvPartitionKey_ = generatePartitionKey();
    kvSortKey_ = generateSortKey();
  }

  /**
   * Constructor from serialised form.
   * 
   * @param jsonObject An immutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public KvItem(ImmutableJsonObject jsonObject, IModelRegistry modelRegistry)
  {
    super(jsonObject, modelRegistry);
    absoluteHash_ = generateHash();
    kvPartitionKey_ = generatePartitionKey();
    kvSortKey_ = generateSortKey();
  }
  
  /**
   * Constructor from mutable JSON object.
   * 
   * @param mutableJsonObject A mutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public KvItem(MutableJsonObject mutableJsonObject, IModelRegistry modelRegistry)
  {
    super(mutableJsonObject, modelRegistry);
    absoluteHash_ = generateHash();
    kvPartitionKey_ = generatePartitionKey();
    kvSortKey_ = generateSortKey();
  }
   
  /**
   * Copy constructor.
   * 
   * @param other Another instance from which all attributes are to be copied.
   */
  public KvItem(IKvItem other)
  {
    super(other);
    
    absoluteHash_ = other.getAbsoluteHash();
    kvPartitionKey_ = other.getKvPartitionKey();
    kvSortKey_ = other.getKvSortKey();
  }
  
  protected Hash generateHash()
  {
//    if(getId() != null)
//      return ((IdPayloadContainer)getPayload()).getId().getAbsoluteHash();
    
    return HashProvider.getHashOf(getHashType().asInteger(), serialize());
  }
  
  private IKvPartitionKey generatePartitionKey()
  {
    return new KvPartitionKey(OBJECT_PREFIX + getPartitionKey().toStringBase64());
  }
  
  private IKvSortKey generateSortKey()
  {
    return new KvSortKey(getSortKey().asString() + SEPARATOR + getAbsoluteHash().toStringBase64());
  }

  @Override
  public IKvPartitionKey getKvPartitionKey()
  {
    return kvPartitionKey_;
  }

  @Override
  public IKvSortKey getKvSortKey()
  {
    return kvSortKey_;
  }

  @Override
  public String getJson()
  {
    return super.toString();
  }

  @Override
  public String getType()
  {
    return getCanonType();
  }

  @Override
  public IFuguePodId getPodId()
  {
    return getOwner().getPodId();
  }

  @Override
  public Hash getAbsoluteHash()
  {
    return absoluteHash_;
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */