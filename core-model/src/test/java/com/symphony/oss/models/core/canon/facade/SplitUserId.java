/*
 * Copyright 2019 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.core.canon.facade;

public class SplitUserId
{
  public static void main(String argv[])
  {
    PodId        expectedPodId  = PodId.newBuilder().build(5006);
    PodAndUserId podAndUserId   = PodAndUserId.newBuilder().build(68719578631L);
    PodAndUserId expectedUserId =  PodAndUserId.newBuilder().build(expectedPodId, podAndUserId.getUserId());
    
    System.out.println("User " + podAndUserId + " is local user " + podAndUserId.getUserId() + " in pod " + podAndUserId.getPodId());
    System.out.println("Expected PodId is " + expectedPodId);
    System.out.println("ExternalUserId = " + expectedUserId);
   
  }
}
