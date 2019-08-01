/**
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 *
 *----------------------------------------------------------------------------------------------------
 * Proforma generated from
 *    Template groupId     org.symphonyoss.s2.canon
 *           artifactId canon-template-java
 *    Template name      proforma/java/Object/I_.java.ftl
 *    Template version     1.0
 *  At                  2018-05-04 06:43:08 PDT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.fundamental.canon.facade;

import javax.annotation.concurrent.Immutable;

import org.symphonyoss.s2.common.hash.Hash;

import com.symphony.oss.models.fundamental.canon.facade.ITraceEntity;
import com.symphony.oss.models.fundmental.canon.ITraceTransactionEntity;

/**
 * Facade for Object ObjectSchema(TraceTransaction)
 * Generated from ObjectSchema(TraceTransaction) at #/components/schemas/TraceTransaction
 */
@Immutable
public interface ITraceTransaction
  extends ITraceTransactionEntity, ITraceEntity
{

  Hash getAbsoluteHash();
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/I_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */