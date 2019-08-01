/**
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 *
 *----------------------------------------------------------------------------------------------------
 * Proforma generated from
 *		Template groupId		 org.symphonyoss.s2.canon
 *           artifactId canon-template-java
 *		Template name		   proforma/java/TypeDef/_Builder.java.ftl
 *		Template version	   1.0
 *  At                  2018-02-14 19:07:41 PST
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.fundamental.canon.facade;
   
import java.time.Instant;

public class InstantBuilder
{
  public static Instant build(String value)
  {
    return Instant.parse(value);
  }
  
  public static String toString(Instant instance)
  {
    return instance.toString();
  }

  public static Instant build(long epochMilli)
  {
    return Instant.ofEpochMilli(epochMilli);
  }
}

/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/TypeDef/_Builder.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */