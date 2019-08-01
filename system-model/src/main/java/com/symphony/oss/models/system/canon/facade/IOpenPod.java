/*
 * Copyright 2019 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.system.canon.facade;

import com.symphony.oss.models.fundamental.canon.facade.IOpenSecurityContext;
import com.symphony.oss.models.fundmental.canon.ISequence;
import com.symphony.oss.models.system.canon.facade.IEnvironment;
import com.symphony.oss.models.system.canon.facade.IOpenPrincipal;
import com.symphony.oss.models.system.canon.facade.IPod;

public interface IOpenPod extends IPod
{

  IOpenSecurityContext getOperatingSecurityContext();
  IOpenPrincipal getOperatingPrincipal();
  ISequence getPodsSequence();
  IOpenSecurityContext getRootSecurityContext();
  IOpenSecurityContext getPublicSecurityContext();
  IEnvironment getEnvironment();
  ISequence getPodPrincipalsSequence();
  ISequence getContentSequence();
}
