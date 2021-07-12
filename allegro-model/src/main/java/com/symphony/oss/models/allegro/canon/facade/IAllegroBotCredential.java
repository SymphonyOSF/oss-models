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
 *  At                  2021-06-18 15:05:37 BST
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.allegro.canon.facade;

import java.security.PrivateKey;
import java.security.PublicKey;

import javax.annotation.concurrent.Immutable;

import com.symphony.oss.models.allegro.canon.IAllegroBotCredentialEntity;

/**
 * Facade for Object ObjectSchema(AllegroBotCredential)
 * Generated from ObjectSchema(AllegroBotCredential) at #/components/schemas/AllegroBotCredential
 */
@Immutable
public interface IAllegroBotCredential
  extends IAllegroBotCredentialEntity
{
  /**
   * Return the decoded private key.
   * 
   * @return the decoded private key.
   */
  PrivateKey getPrivateKey();

  /**
   * Return the decoded public key.
   * 
   * @return the decoded public key.
   */
  PublicKey getPublicKey();

  /**
   * Return the key ID for use as a kid header in a JWT.
   * 
   * @return the key ID for use as a kid header in a JWT.
   */
  String getKeyId();
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/I_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */