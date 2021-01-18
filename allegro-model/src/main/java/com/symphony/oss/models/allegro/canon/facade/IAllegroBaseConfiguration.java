/**
 * Copyright 2020 Symphony Communication Services, LLC.
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
 *  At                  2020-06-23 13:24:02 BST
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.allegro.canon.facade;

import javax.annotation.concurrent.Immutable;

import com.symphony.oss.commons.dom.json.ImmutableJsonObject;
import com.symphony.oss.models.allegro.canon.IAllegroBaseConfigurationEntity;

/**
 * Facade for Object ObjectSchema(AllegroBaseConfiguration)
 * Generated from ObjectSchema(AllegroBaseConfiguration) at #/components/schemas/AllegroBaseConfiguration
 */
@Immutable
public interface IAllegroBaseConfiguration
  extends IAllegroBaseConfigurationEntity
{
  /**
   * Return the connection settings to be used on all connections which do not specify specific settings.
   * 
   * @return the connection settings to be used on all connections which do not specify specific settings.
   */
  IConnectionSettings getDefaultConnectionSettings();

  /**
   * Return a copy of this object's configuration with any passwords or credentials redacted.
   * 
   * The returned object can safely be logged.
   * 
   * @return a copy of this object's configuration with any passwords or credentials redacted.
   */
  ImmutableJsonObject getRedacted();
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/I_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */