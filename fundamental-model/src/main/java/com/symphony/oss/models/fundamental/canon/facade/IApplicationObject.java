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
 *  At                  2018-05-14 14:37:44 PDT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.fundamental.canon.facade;

import javax.annotation.concurrent.Immutable;

import org.symphonyoss.s2.common.hash.Hash;

import com.symphony.oss.models.fundamental.canon.facade.IBlob;
import com.symphony.oss.models.fundmental.canon.IApplicationObjectEntity;

/**
 * Facade for Object ObjectSchema(ApplicationObject)
 *
 * Generated from ObjectSchema(ApplicationObject) at #/components/schemas/ApplicationObject
 */
@Immutable
public interface IApplicationObject
  extends IApplicationObjectEntity
{
//  /**
//   * Encrypt without signing.
//   * Should only be used on environment root objects.
//   * 
//   * @param securityContext The security context with which to encrypt.
//   * 
//   * @return The encrypted blob of this object.
//   */
//  IFundamentalObject encrypt(IOpenSecurityContext securityContext, @Nullable TenantId tenantId);
//
//  /**
//   * Encrypt and sign the object with the given context and key.
//   * 
//   * @param securityContext The security context with which to encrypt.
//   * @param principalKey    The key with which to sign.
//   * 
//   * @return The encrypted and signed blob of this object.
//   */
//  IFundamentalObject encryptAndSign(IOpenSecurityContext securityContext, IOpenSigningKey principalKey, @Nullable TenantId tenantId);

  Hash getAbsoluteHash();

  Hash getPrevHash();

  Hash getBaseHash();

  IBlob getBlob();
  
  void setBlob(IBlob blob);
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/I_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */