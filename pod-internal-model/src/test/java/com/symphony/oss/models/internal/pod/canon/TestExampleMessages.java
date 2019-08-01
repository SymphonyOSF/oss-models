/*
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.internal.pod.canon;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;

import org.junit.Test;
import org.symphonyoss.s2.canon.runtime.EntityFactory;
import org.symphonyoss.s2.canon.runtime.IModelRegistry;
import org.symphonyoss.s2.canon.runtime.ModelRegistry;
import org.symphonyoss.s2.common.dom.json.ImmutableJsonObject;
import org.symphonyoss.s2.common.dom.json.MutableJsonObject;
import org.symphonyoss.s2.common.dom.json.jackson.JacksonAdaptor;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.symphony.oss.models.chat.canon.ChatModel;
import com.symphony.oss.models.fundmental.canon.FundamentalModel;

public class TestExampleMessages
{
  public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
  
  @Test
  public void testExampleMessages() throws Exception
  {
    ModelRegistry regsitry = new ModelRegistry()
        .withFactories(PodInternalModel.FACTORIES)
        .withFactories(ChatModel.FACTORIES)
        .withFactories(FundamentalModel.FACTORIES);
    
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
