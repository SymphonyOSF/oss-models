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
 *		Template name		   proforma/java/Object/I_.java.ftl
 *		Template version	   1.0
 *  At                  2019-11-07 08:33:44 GMT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.core.canon.facade;

import java.util.Map;

import javax.annotation.concurrent.Immutable;

import com.symphony.oss.models.core.canon.IEnvelopeEntity;


/**
 * Facade for Object ObjectSchema(Envelope)
 *
 * This is not a persisted object it exists only on a pub sub topic.
 * Generated from ObjectSchema(Envelope) at #/components/schemas/Envelope
 */
@Immutable
public interface IEnvelope
  extends IEnvelopeEntity
{
  /**
   * Create attributes suitable for use with IPubSubMessage.
   *  
   * @return A map of attribute value pairs.
   */
  Map<String, Object> getAttributes();
}