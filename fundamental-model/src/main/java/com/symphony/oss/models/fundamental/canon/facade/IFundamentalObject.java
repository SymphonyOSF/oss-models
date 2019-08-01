/**
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 *
 *----------------------------------------------------------------------------------------------------
 * Proforma generated from
 *		Template groupId		 org.symphonyoss.s2.canon
 *           artifactId canon-template-java
 *		Template name		   proforma/java/Object/I_.java.ftl
 *		Template version	   1.0
 *  At                  2018-02-23 15:21:01 GMT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.fundamental.canon.facade;

import javax.annotation.concurrent.Immutable;

import org.symphonyoss.s2.common.hash.Hash;
import org.symphonyoss.s2.fugue.core.trace.ITraceContext;
import org.symphonyoss.s2.fugue.store.IFugueObject;

import com.symphony.oss.models.fundamental.canon.facade.ISigningKey;
import com.symphony.s2.model.fundamental.crypto.cipher.SignatureVerificationException;
import com.symphony.oss.models.fundmental.canon.IFundamentalObjectEntity;

/**
 * Facade for Object ObjectSchema(FundamentalObject)
 * Generated from ObjectSchema(FundamentalObject) at #/components/schemas/FundamentalObject
 */
@Immutable
public interface IFundamentalObject
  extends IFundamentalObjectEntity, IFugueObject
{
  /**
   * Return the absolute hash for this object.
   * 
   * This will be a hash of the type which was current when the object was created, i.e. using the hash type
   * which is encoded in the object, not the current default hash type.
   * 
   * @return the absolute hash for this object.
   */
  Hash getAbsoluteHash();
  
  /**
   * Return the range key for this object, which consists of the create timestamp concatenated with the hash.
   * 
   * @return The range key for this object.
   */
  String  getRangeKey();

  void trace(ITraceContext trace, String operationId);

  /**
   * Return a short textual description of this object including its type and absoluteHash.
   * 
   * Open objects should indicate their internal type, for example an OpenBlob should indicate the
   * type of the enclosed application payload.
   * @return a short textual description of this object.
   */
  String getDescription();

  /**
   * Verify the signature on this object using the given signingKey.
   * 
   * @param signingKey  The key to use for verification.
   * 
   * @throws SignatureVerificationException If the signature is not verified.
   */
  void verifySignature(ISigningKey signingKey) throws SignatureVerificationException;
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/I_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */