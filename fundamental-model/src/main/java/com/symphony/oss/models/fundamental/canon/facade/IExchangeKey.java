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
 *  At                  2018-05-15 16:35:29 PDT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.fundamental.canon.facade;

import javax.annotation.concurrent.Immutable;
import javax.crypto.SecretKey;

import com.symphony.oss.models.fundamental.canon.facade.IAbstractPublicKey;
import com.symphony.oss.models.fundamental.canon.facade.WrappedKey;
import com.symphony.oss.models.fundmental.canon.IExchangeKeyEntity;

/**
 * A key exchange key, which can be used to wrap secret keys to make them available to the owner of
 * the current key.
 * 
 * Facade for Object ObjectSchema(ExchangeKey)
 * Generated from ObjectSchema(ExchangeKey) at #/components/schemas/ExchangeKey
 */
@Immutable
public interface IExchangeKey
  extends IAbstractPublicKey, IExchangeKeyEntity
{
  /**
   * Wrap the given secret key.
   * 
   * @param key A secret key.
   * 
   * @return The given key wrapped (encrypted) in this public key.
   */
  WrappedKey wrap(SecretKey key);
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/I_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */