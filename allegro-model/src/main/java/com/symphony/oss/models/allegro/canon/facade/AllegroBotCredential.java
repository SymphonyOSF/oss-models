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
 *  At                  2021-06-18 15:05:37 BST
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.allegro.canon.facade;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.annotation.concurrent.Immutable;

import org.apache.commons.codec.binary.Base64;

import com.symphony.oss.canon.runtime.IModelRegistry;
import com.symphony.oss.commons.dom.json.ImmutableJsonObject;
import com.symphony.oss.commons.dom.json.MutableJsonObject;
import com.symphony.oss.models.allegro.canon.AllegroBotCredentialEntity;
import com.symphony.oss.models.crypto.cipher.CipherSuiteUtils;

/**
 * Facade for Object ObjectSchema(AllegroBotCredential)
 * Generated from ObjectSchema(AllegroBotCredential) at #/components/schemas/AllegroBotCredential
 */
@Immutable
public class AllegroBotCredential extends AllegroBotCredentialEntity implements IAllegroBotCredential
{
  private PrivateKey privateKey_  = CipherSuiteUtils.privateKeyFromPem(getEncodedPrivateKey());
  private PublicKey  publicKey_   = CipherSuiteUtils.publicKeyFromPem(getEncodedPublicKey());
  private String      keyId_      = generateKid(publicKey_);
  
  public static String generateKid(PublicKey  publicKey)
  {
    try
    {
      byte[] bytes = MessageDigest.getInstance("SHA-1").digest(publicKey.getEncoded());
      
      return Base64.encodeBase64String(bytes).toString();
    }
    catch(NoSuchAlgorithmException e)
    {
      throw new IllegalStateException("SHA-1 is not a valid algorithm!", e);
    }
  }
  
  /**
   * Constructor from builder.
   * 
   * @param builder A mutable builder containing all values.
   */
  public AllegroBotCredential(AbstractAllegroBotCredentialBuilder<?,?> builder)
  {
    super(builder);
  }
  
  /**
   * Constructor from serialised form.
   * 
   * @param jsonObject An immutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public AllegroBotCredential(ImmutableJsonObject jsonObject, IModelRegistry modelRegistry)
  {
    super(jsonObject, modelRegistry);
  }
  
  /**
   * Constructor from mutable JSON object.
   * 
   * @param mutableJsonObject A mutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public AllegroBotCredential(MutableJsonObject mutableJsonObject, IModelRegistry modelRegistry)
  {
    super(mutableJsonObject, modelRegistry);
  }
   
  /**
   * Copy constructor.
   * 
   * @param other Another instance from which all attributes are to be copied.
   */
  public AllegroBotCredential(IAllegroBotCredential other)
  {
    super(other);
  }

  @Override
  public PrivateKey getPrivateKey()
  {
    return privateKey_;
  }

  @Override
  public PublicKey getPublicKey()
  {
    return publicKey_;
  }

  @Override
  public String getKeyId()
  {
    return keyId_;
  }
  
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */