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
import java.util.List;

import javax.annotation.concurrent.Immutable;

import org.symphonyoss.s2.canon.runtime.CanonRuntime;
import org.symphonyoss.s2.canon.runtime.IModelRegistry;
import org.symphonyoss.s2.common.dom.json.ImmutableJsonObject;
import org.symphonyoss.s2.common.dom.json.MutableJsonObject;
import org.symphonyoss.s2.common.hash.Hash;
import org.symphonyoss.s2.common.immutable.ImmutableByteArray;

import com.symphony.oss.models.core.canon.facade.InstantBuilder;
import com.symphony.oss.models.core.canon.facade.PodAndUserId;
import com.symphony.oss.models.core.canon.facade.RotationId;
import com.symphony.oss.models.core.canon.facade.ThreadId;
import com.symphony.oss.models.crypto.canon.CipherSuiteId;
import com.symphony.oss.models.crypto.canon.EncryptedData;
import com.symphony.oss.models.object.canon.IStoredApplicationObjectEntity;
import com.symphony.oss.models.object.canon.StoredApplicationObjectEntity;

/**
 * Facade for Object ObjectSchema(StoredApplicationObject)
 *
 * Base type for application objects in the object store.
 * Generated from ObjectSchema(StoredApplicationObject) at #/components/schemas/StoredApplicationObject
 */
@Immutable
public class StoredApplicationObject extends StoredApplicationObjectEntity implements IStoredApplicationObject
{
  /**
   * Constructor from builder.
   * 
   * @param builder A mutable builder containing all values.
   */
  public StoredApplicationObject(AbstractStoredApplicationObjectBuilder<?,?> builder)
  {
    super(builder);
  }
  
  /**
   * Constructor from serialised form.
   * 
   * @param jsonObject An immutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public StoredApplicationObject(ImmutableJsonObject jsonObject, IModelRegistry modelRegistry)
  {
    super(jsonObject, modelRegistry);
  }
  
  /**
   * Constructor from mutable JSON object.
   * 
   * @param mutableJsonObject A mutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public StoredApplicationObject(MutableJsonObject mutableJsonObject, IModelRegistry modelRegistry)
  {
    super(mutableJsonObject, modelRegistry);
  }
   
  /**
   * Copy constructor.
   * 
   * @param other Another instance from which all attributes are to be copied.
   */
  public StoredApplicationObject(IStoredApplicationObject other)
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
   * Abstract builder for StoredApplicationObject. If there are sub-classes of this type then their builders sub-class this builder.
   *
   * @param <B> The concrete type of the builder, used for fluent methods.
   * @param <T> The concrete type of the built object.
   */
  public static abstract class AbstractStoredApplicationObjectBuilder<B extends AbstractStoredApplicationObjectBuilder<B,T>, T extends IStoredApplicationObjectEntity> extends AbstractStoredApplicationObjectEntityBuilder<B,T>
  {
    protected AbstractStoredApplicationObjectBuilder(Class<B> type)
    {
      super(type);
    }
    
    protected AbstractStoredApplicationObjectBuilder(Class<B> type, IStoredApplicationObjectEntity initial)
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
  

  
  
//  /**
//   * Abstract builder for StoredApplicationObject. If there are sub-classes of this type then their builders sub-class this builder.
//   *
//   * @param <B> The concrete type of the builder, used for fluent methods.
//   * @param <T> The concrete type of the built object.
//   */
//   public static abstract class AbstractStoredApplicationObjectEntityUpdater<B extends AbstractStoredApplicationObjectEntityUpdater<B,T>, T extends IStoredApplicationObjectEntity>
//    extends SystemObject.AbstractSystemObjectBuilder<B,T>
//  {
//    protected Hash                       _partitionHash_;
//    protected SortKey                    _sortKey_;
//    protected Instant                    _createdDate_;
//    protected PodAndUserId               _owner_;
//    protected Hash                       _baseHash_;
//    protected Hash                       _prevHash_;
//    protected SortKey                    _prevSortKey_;
//    protected Instant                    _purgeDate_;
//    protected IApplicationObjectHeader   _header_;
//    protected EncryptedData              _encryptedPayload_;
//    protected CipherSuiteId              _cipherSuiteId_;
//    protected ThreadId                   _threadId_;
//    protected RotationId                 _rotationId_;
//    
//    protected AbstractStoredApplicationObjectEntityUpdater(Class<B> type, IStoredApplicationObject initial)
//    {
//      super(type, initial);
//      
//      _partitionHash_ = initial.getPartitionHash();
//      _prevSortKey_ = _sortKey_ = initial.getSortKey();
//      _createdDate_ = Instant.now();
//      _baseHash_ = initial.getBaseHash();
//      _prevHash_ = initial.getAbsoluteHash();
//      _purgeDate_ = initial.getPurgeDate();
//      _header_ = initial.getHeader();
//      _encryptedPayload_ = initial.getEncryptedPayload();
//      _cipherSuiteId_ = initial.getCipherSuiteId();
//      _threadId_ = initial.getThreadId();
//      _rotationId_ = initial.getRotationId();
//    }
//    
//    
//    public void populateAllFields(List<Object> result)
//    {
//      super.populateAllFields(result);
//      result.add(_partitionHash_);
//      result.add(_sortKey_);
//      result.add(_createdDate_);
//      result.add(_owner_);
//      result.add(_baseHash_);
//      result.add(_prevHash_);
//      result.add(_prevSortKey_);
//      result.add(_purgeDate_);
//      result.add(_header_);
//      result.add(_encryptedPayload_);
//      result.add(_cipherSuiteId_);
//      result.add(_threadId_);
//      result.add(_rotationId_);
//    }
//
//    
//    public Hash getBaseHash()
//    {
//      return _baseHash_;
//    }
//    
//    public Hash getPrevHash()
//    {
//      return _prevHash_;
//    }
//    
//    public Hash getPartitionHash()
//    {
//      return _partitionHash_;
//    }
//    
//    public SortKey getSortKey()
//    {
//      return _sortKey_;
//    }
//  
//    public B withSortKey(SortKey value)
//    {
//        if(value == null)
//          throw new IllegalArgumentException("value is required.");
//
//      _sortKey_ = value;
//      return self();
//    }
//    
//    public B withSortKey(String value)
//    {
//      if(value == null)
//        throw new IllegalArgumentException("sortKey is required.");
//  
//      _sortKey_ = SortKey.newBuilder().build(value);
//      return self();
//    }
//    
//    public Instant getCreatedDate()
//    {
//      return _createdDate_;
//    }
//  
//    public B withCreatedDate(Instant value)
//    {
//      _createdDate_ = value;
//      return self();
//    }
//    
//    public B withCreatedDate(String value)
//    {
//      _createdDate_ = InstantBuilder.build(value);
//      return self();
//    }
//    
//    public PodAndUserId getOwner()
//    {
//      return _owner_;
//    }
//  
//    public B withOwner(PodAndUserId value)
//    {
//      _owner_ = value;
//      return self();
//    }
//    
//    public B withOwner(Long value)
//    {
//      _owner_ = PodAndUserId.newBuilder().build(value);
//      return self();
//    }
//    
//    public SortKey getPrevSortKey()
//    {
//      return _prevSortKey_;
//    }
//    
//    public Instant getPurgeDate()
//    {
//      return _purgeDate_;
//    }
//  
//    public B withPurgeDate(Instant value)
//    {
//      _purgeDate_ = value;
//      return self();
//    }
//    
//    public B withPurgeDate(String value)
//    {
//      _purgeDate_ = InstantBuilder.build(value);
//      return self();
//    }
//    
//    public IApplicationObjectHeader getHeader()
//    {
//      return _header_;
//    }
//  
//    public B withHeader(IApplicationObjectHeader value)
//    {
//      _header_ = value;
//      return self();
//    }
//    
//    public EncryptedData getEncryptedPayload()
//    {
//      return _encryptedPayload_;
//    }
//  
//    public B withEncryptedPayload(EncryptedData value)
//    {
//      _encryptedPayload_ = value;
//      return self();
//    }
//    
//    public B withEncryptedPayload(ImmutableByteArray value)
//    {
//      _encryptedPayload_ = EncryptedData.newBuilder().build(value);
//      return self();
//    }
//    
//    public CipherSuiteId getCipherSuiteId()
//    {
//      return _cipherSuiteId_;
//    }
//    
//    public ThreadId getThreadId()
//    {
//      return _threadId_;
//    }
//    
//    public RotationId getRotationId()
//    {
//      return _rotationId_;
//    }
//  
//    @Override 
//    public ImmutableJsonObject getJsonObject()
//    {
//      MutableJsonObject jsonObject = new MutableJsonObject();
//      
//      jsonObject.addIfNotNull(CanonRuntime.JSON_TYPE, StoredApplicationObjectEntity.TYPE_ID);
//      jsonObject.addIfNotNull(CanonRuntime.JSON_VERSION, StoredApplicationObjectEntity.TYPE_VERSION);
//
//      getJsonObject(jsonObject);
//  
//      return jsonObject.immutify();
//    }
//    
//    @Override 
//    public void getJsonObject(MutableJsonObject jsonObject)
//    {
//      super.getJsonObject(jsonObject);
//  
//      if(getPartitionHash() != null)
//      {
//          jsonObject.addIfNotNull("partitionHash", Hash.toImmutableByteArray(getPartitionHash()));
//      }
//  
//      if(getSortKey() != null)
//      {
//          jsonObject.addIfNotNull("sortKey", getSortKey().getValue());
//      }
//  
//      if(getCreatedDate() != null)
//      {
//          jsonObject.addIfNotNull("createdDate", InstantBuilder.toString(getCreatedDate()));
//      }
//  
//      if(getOwner() != null)
//      {
//          jsonObject.addIfNotNull("owner", getOwner().getValue());
//      }
//  
//      if(getBaseHash() != null)
//      {
//          jsonObject.addIfNotNull("baseHash", Hash.toImmutableByteArray(getBaseHash()));
//      }
//  
//      if(getPrevHash() != null)
//      {
//          jsonObject.addIfNotNull("prevHash", Hash.toImmutableByteArray(getPrevHash()));
//      }
//  
//      if(getPrevSortKey() != null)
//      {
//          jsonObject.addIfNotNull("prevSortKey", getPrevSortKey().getValue());
//      }
//  
//      if(getPurgeDate() != null)
//      {
//          jsonObject.addIfNotNull("purgeDate", InstantBuilder.toString(getPurgeDate()));
//      }
//  
//      if(getHeader() != null)
//      {
//          jsonObject.addIfNotNull("header", getHeader().getJsonObject());
//      }
//  
//      if(getEncryptedPayload() != null)
//      {
//          jsonObject.addIfNotNull("encryptedPayload", getEncryptedPayload().getValue());
//      }
//  
//      if(getCipherSuiteId() != null)
//      {
//          jsonObject.addIfNotNull("cipherSuiteId", getCipherSuiteId().toString());
//      }
//  
//      if(getThreadId() != null)
//      {
//          jsonObject.addIfNotNull("threadId", getThreadId().getValue());
//      }
//  
//      if(getRotationId() != null)
//      {
//          jsonObject.addIfNotNull("rotationId", getRotationId().getValue());
//      }
//    }
//  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */