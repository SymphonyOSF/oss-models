/*
 *
 *
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
 */

package com.symphony.oss.models.object.canon.facade;

import com.symphony.oss.canon.runtime.IModelRegistry;
import com.symphony.oss.commons.dom.json.ImmutableJsonObject;
import com.symphony.oss.models.core.canon.IApplicationPayload;

/**
 * A decrypted ObjectPayload.
 * 
 * @author Bruce Skingle
 *
 */
public class OpenObjectPayload extends StoredApplicationObject implements IOpenObjectPayload
{
  private final IApplicationPayload payload_;
  
  /**
   * Constructor.
   * 
   * @param jsonObject      Serialized form.
   * @param modelRegistry   Model registry.
   * @param payload         Decrypted payload.
   */
  public OpenObjectPayload(ImmutableJsonObject jsonObject, IModelRegistry modelRegistry, IApplicationPayload payload)
  {
    super(jsonObject, modelRegistry);
    payload_ = payload;
  }

  @Override
  public IApplicationPayload getPayload()
  {
    return payload_;
  }

}
