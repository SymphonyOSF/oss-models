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
 *  At                  2018-05-15 14:21:52 PDT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.fundamental.canon.facade;

import javax.annotation.concurrent.Immutable;

import org.symphonyoss.s2.canon.runtime.IModelRegistry;
import org.symphonyoss.s2.common.exception.NoSuchObjectException;

import com.symphony.oss.models.fundamental.canon.facade.IApplicationObject;
import com.symphony.oss.models.fundamental.canon.facade.IOpenPrincipalCredential;
import com.symphony.oss.models.fundamental.canon.facade.IOpenSimpleSecurityContext;
import com.symphony.oss.models.fundamental.canon.facade.IVersionedObject;
import com.symphony.oss.models.fundmental.canon.IBlobEntity;

/**
 * Facade for Object ObjectSchema(Blob)
 *
 * If tenantId is present then the security context belongs to a tenant operating principal (i.e. this is a legacy wrapped object)
 * Generated from ObjectSchema(Blob) at #/components/schemas/Blob
 */
@Immutable
public interface IBlob
  extends IVersionedObject, IBlobEntity
{

  IApplicationObject open(IOpenPrincipalCredential credential)
      throws NoSuchObjectException;

  IApplicationObject open(IOpenSimpleSecurityContext securityContext, IModelRegistry modelRegistry);
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/I_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */