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
 *  At                  2018-05-15 16:17:26 PDT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.fundamental.canon.facade;

import javax.annotation.concurrent.Immutable;

import org.symphonyoss.s2.common.immutable.ImmutableByteArray;

import com.symphony.oss.models.fundamental.canon.facade.IAbstractPublicKey;
import com.symphony.s2.model.fundamental.crypto.cipher.SignatureVerificationException;
import com.symphony.oss.models.fundmental.canon.EncodedSignature;
import com.symphony.oss.models.fundmental.canon.ISigningKeyEntity;

/**
 * A signing key which can be used to verify signatures created by the owner of the current key.
 * 
 * Facade for Object ObjectSchema(SigningKey)
 * Generated from ObjectSchema(SigningKey) at #/components/schemas/SigningKey
 */
@Immutable
public interface ISigningKey
  extends IAbstractPublicKey, ISigningKeyEntity
{
  /**
   * Verify that the given signature is a valid signature over the given data.
   * 
   * If the signature is not valid an exception is thrown.
   * 
   * @param encodedSignature  The signature to be verified.
   * @param data              The data which the signature is expected to cover.
   * 
   * @throws SignatureVerificationException If the signature is invalid for any reason.
   */
  void verifySignature(EncodedSignature encodedSignature, ImmutableByteArray data) throws SignatureVerificationException;
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/I_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */