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
 *		Template name		   proforma/java/Object/I_.java.ftl
 *		Template version	   1.0
 *  At                  2021-03-04 15:35:33 GMT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.core.canon.facade;

import javax.annotation.concurrent.Immutable;

import com.symphony.oss.models.core.canon.IApplicationPayload;
import com.symphony.oss.models.core.canon.IEncryptedRecordEntity;

/**
 * Facade for Object ObjectSchema(EncryptedRecord)
 *
 * An encrypted Application Record consisting of an encrypted payload and a unencrypted header, as might be stored in a database.
 * Generated from ObjectSchema(EncryptedRecord) at #/components/schemas/EncryptedRecord
 */
@Immutable
public interface IEncryptedRecord
  extends IApplicationPayload, IEncryptedRecordEntity
{
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/I_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */