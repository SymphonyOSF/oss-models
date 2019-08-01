/*
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.canon.facade;

import static org.junit.Assert.assertEquals;

import java.time.Instant;

import org.junit.Test;

public class TestInstantBuilder
{
  @Test
  public void testInstantBuilder()
  {
    Instant now = Instant.now();
    
    String a = InstantBuilder.toString(now);
    
    Instant then = InstantBuilder.build(a);
    
    System.out.println("now  = " + now);
    System.out.println("then = " + then);
    
    assertEquals(now, then);
  }

}
