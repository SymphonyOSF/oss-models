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
 *		Template name		   proforma/java/Model/I_ModelEntity.java.ftl
 *		Template version	   1.0
 *  At                  2019-02-08 16:30:30 GMT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.internal.km.canon.facade;


import org.symphonyoss.s2.canon.runtime.IEntity;

import com.symphony.oss.models.crypto.canon.CipherSuiteId;
import com.symphony.oss.models.crypto.cipher.CipherSuite;
import com.symphony.oss.models.crypto.cipher.ICipherSuite;

/**
 * Base interface for all KM Internal model entities.
 * 
 * @author Bruce Skingle
 *
 */
public interface IKmInternalModelEntity extends IEntity
{
  /** The ID of the CipherSuite used by SBE */
  static final CipherSuiteId       SbeCipherSuiteId = CipherSuiteId.RSA2048_AES256;
  
  /**
   * 
   * @return The CipherSuite to be used with this object. This is currently fixed.
   */
  default ICipherSuite getCipherSuite()
  {
    return CipherSuite.get(SbeCipherSuiteId);
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Model/I_ModelEntity.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */