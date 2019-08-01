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
 *  At                  2018-05-15 18:25:31 PDT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.fundamental.canon.facade;

import java.security.PublicKey;

import javax.annotation.concurrent.Immutable;

import com.symphony.oss.models.fundamental.canon.facade.IVersionedObject;
import com.symphony.s2.model.fundamental.crypto.cipher.ICipherSuite;
import com.symphony.oss.models.fundmental.canon.IAbstractPublicKeyEntity;

/**
 * A public key.
 * 
 * Facade for Object ObjectSchema(AbstractPublicKey)
 * Generated from ObjectSchema(AbstractPublicKey) at #/components/schemas/AbstractPublicKey
 */
@Immutable
public interface IAbstractPublicKey
  extends IVersionedObject, IAbstractPublicKeyEntity
{
  /**
   * Return the CipherSuite to which the key belongs.
   * 
   * @return The CipherSuite to which the key belongs.
   */
  ICipherSuite getCipherSuite();

  /**
   * Return the public key object.
   * 
   * @return The public key object.
   */
  PublicKey getPublicKey();
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/I_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */