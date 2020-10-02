/*
 * Copyright 2020 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.s2.authc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * An authentication and authorization context for support portal.
 * 
 * @author Geremia Longobardo
 *
 */
public class SupportContext implements ISupportContext
{
  boolean                     entitled_;
  private String              email_;

  /**
   * Constructor.
   * 
   * See the interface class comment for details.
   * 
   * @param email                 Email of PMP user
   * @param entitled              true if entitled
   */
  public SupportContext(String email, boolean entitled)
  {
    email_        = email;
    entitled_     = entitled;  
  } 

  @Override
  public boolean hasEntitlements()
  {
    return entitled_;
  }

  @Override
  public String getEmail()
  {
    return email_;
  }

}
