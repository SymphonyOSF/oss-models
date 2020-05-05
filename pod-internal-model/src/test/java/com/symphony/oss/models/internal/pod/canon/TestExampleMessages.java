/*
 * Copyright 2018 Symphony Communication Services, LLC.
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

package com.symphony.oss.models.internal.pod.canon;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.symphony.oss.canon.runtime.EntityFactory;
import com.symphony.oss.canon.runtime.IModelRegistry;
import com.symphony.oss.canon.runtime.ModelRegistry;
import com.symphony.oss.commons.dom.json.ImmutableJsonObject;
import com.symphony.oss.commons.dom.json.MutableJsonObject;
import com.symphony.oss.commons.dom.json.jackson.JacksonAdaptor;
import com.symphony.oss.models.chat.canon.ChatModel;
import com.symphony.oss.models.core.canon.CoreModel;

public class TestExampleMessages
{
  public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
  
  @Test
  public void testExampleMessages() throws Exception
  {
    ModelRegistry regsitry = new ModelRegistry()
        .withFactories(PodInternalModel.FACTORIES)
        .withFactories(ChatModel.FACTORIES)
        .withFactories(CoreModel.FACTORIES);
    
    URL messages = getClass().getResource("/exampleMessages");
    File file = new File(messages.getFile());
    File[] files = file.listFiles();
    
    for(File f : files)
    {
      if(f.getName().endsWith(".json"))
      {
        String                name          = f.getName().substring(0, f.getName().length() - 5);
        Class<?>              clazz         = getCanonClass(name);
        Field                 factoryField  = clazz.getField("FACTORY");
        EntityFactory<?,?,?>  factory       = (EntityFactory<?, ?, ?>)factoryField.get(null);
        Field                 builderField  = clazz.getField("BUILDER");
        Object                builderFactory = builderField.get(null);
        Method                builderMethod = builderFactory.getClass().getMethod("newInstance", null);
        Object                builder       = builderMethod.invoke(builderFactory, null);
        Method                withValues    = builder.getClass().getMethod("withValues", ImmutableJsonObject.class, boolean.class, IModelRegistry.class);
        Method                build         = builder.getClass().getMethod("build", null);
        
        
        
        try(FileReader in = new FileReader(f))
        {
          JsonNode jsonTree = OBJECT_MAPPER.readTree(in);
          
          MutableJsonObject jsonObject = JacksonAdaptor.adaptObject((ObjectNode) jsonTree);
          
          withValues.invoke(builder, jsonObject.immutify(), false, regsitry);

          Object message = build.invoke(builder, null);
          
          System.out.println(message.toString());
        }
      }
    }
  }

  private Class<?> getCanonClass(String name)
  {
    try
    {
      return Class.forName("com.symphony.oss.models.internal.pod.canon." + name);
    }
    catch (ClassNotFoundException e)
    {
      try
      {
        return Class.forName("com.symphony.oss.models.internal.pod.canon.facade." + name);
      }
      catch (ClassNotFoundException e1)
      {
        throw new RuntimeException(e);
      }
    }
  }
}
