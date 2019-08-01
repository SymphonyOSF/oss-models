/*
 * Copyright 2019 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.calendar.canon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.symphonyoss.s2.common.hash.Hash;
import org.symphonyoss.s2.common.hash.HashProvider;

public class TestFundamentalId
{
  @Test
  public void testFundamentalId()
  {
    Hash                        principalHash1 = HashProvider.getHashOf("SomeRandomHash".getBytes());
    ICalendarItemSequenceId    id1   = new CalendarItemSequenceId.Builder()
        .withPrincipalHash(principalHash1)
        .build();
    System.out.println("id1  = " + id1);
    
    assertEquals(principalHash1.getTypeId(), id1.getAbsoluteHash().getTypeId());
    
    Hash                        principalHash2 = HashProvider.getHashOf(2, "SomeRandomHash".getBytes());
    ICalendarItemSequenceId    id2   = new CalendarItemSequenceId.Builder()
        .withPrincipalHash(principalHash2)
        .build();
    System.out.println("id2  = " + id2);
    
    assertEquals(principalHash2.getTypeId(), id2.getAbsoluteHash().getTypeId());
    
    assertNotEquals(principalHash1, principalHash2);

    assertNotEquals(id1, id2);
  }
}
