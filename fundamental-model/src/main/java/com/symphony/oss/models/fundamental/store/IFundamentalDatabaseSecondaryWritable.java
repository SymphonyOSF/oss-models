/*
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.store;

import org.symphonyoss.s2.fugue.core.trace.ITraceContext;

import com.symphony.oss.models.fundamental.canon.facade.INotification;

/**
 * A secondary storage writable object database for Fundamental Objects.
 * 
 * @author Bruce Skingle
 *
 */
public interface IFundamentalDatabaseSecondaryWritable extends IFundamentalDatabaseReadOnly
{
  /**
   * Perform secondary storage processing on the given message.
   * 
   * @param notification        A notification message for the object to be stored. 
   * @param payloadLimit        Max size of payload which will be written to primary storage.
   * @param validSequenceHashes Sequences to which the object should be added.
   * @param trace               A trace context.
   */
  void saveToSecondaryStorage(INotification notification, int payloadLimit, ValidSequenceHashes validSequenceHashes, ITraceContext trace);
}
