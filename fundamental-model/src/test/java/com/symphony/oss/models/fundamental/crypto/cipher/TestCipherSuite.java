/*
 * Copyright 2016-2017  Symphony Communication Services, LLC.
 *
 * All Rights Reserved
 */

package com.symphony.oss.models.fundamental.crypto.cipher;

import static org.junit.Assert.assertEquals;

import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.PrivateKey;

import javax.crypto.SecretKey;

import org.junit.Test;
import org.symphonyoss.s2.common.immutable.ImmutableByteArray;

import com.symphony.oss.models.fundamental.canon.facade.WrappedKey;
import com.symphony.oss.models.fundamental.crypto.cipher.CipherSuite;
import com.symphony.oss.models.fundamental.crypto.cipher.ICipherSuite;
import com.symphony.oss.models.fundamental.crypto.cipher.UnknownCipherSuiteException;
import com.symphony.oss.models.fundmental.canon.Base64SecretKey;
import com.symphony.oss.models.fundmental.canon.CipherSuiteId;
import com.symphony.oss.models.fundmental.canon.EncryptedData;

public class TestCipherSuite
{
  @Test
  public void testKeySizes() throws UnknownCipherSuiteException
  {
    for(ICipherSuite cipherSuite : CipherSuite.getAllCipherSuites())
    {
      KeyPair keyPair = cipherSuite.generateKeyPair();
      assertEquals(CipherSuite.get(keyPair.getPublic()), cipherSuite);

      SecretKey key = cipherSuite.generateKey();
      
      if(cipherSuite.getId() != CipherSuiteId.ECC521_AES256)
        assertEquals(cipherSuite, CipherSuite.get(key));
    }
  }
  
  @Test
  public void testEncrypt()
  {
    String  input = "Hello World";
    ImmutableByteArray data = ImmutableByteArray.newInstance(input.getBytes(StandardCharsets.UTF_8));
    
    for(ICipherSuite cipherSuite : CipherSuite.getAllCipherSuites())
    {
     System.out.println("testEncrypt " + cipherSuite);
      SecretKey secretKey = cipherSuite.generateKey();
      
      EncryptedData cipherText = cipherSuite.encrypt(secretKey, data);
      ImmutableByteArray clearText = cipherSuite.decrypt(secretKey, cipherText);
      
      assertEquals(data, clearText);
    }
  }
  
  @Test
  public void testWrap()
  {
    
    for(ICipherSuite cipherSuite : CipherSuite.getAllCipherSuites())
    {
      System.out.println("testWrap " + cipherSuite);
      SecretKey secretKey = cipherSuite.generateKey();
      KeyPair keyPair = cipherSuite.generateKeyPair();

      
      WrappedKey wrappedKey = cipherSuite.wrap(keyPair.getPrivate(), secretKey);
      PrivateKey clearKey = cipherSuite.unwrap(wrappedKey, secretKey);
      
      assertEquals(keyPair.getPrivate(), clearKey);
    }
  }
  
  @Test
  public void testSecretBase64()
  {
    for(ICipherSuite cipherSuite : CipherSuite.getAllCipherSuites())
    {
      System.out.println("testSecretBase64 " + cipherSuite);
      SecretKey secretKey = cipherSuite.generateKey();
      
      Base64SecretKey encodedKey = cipherSuite.secretKeyToBase64(secretKey);
      SecretKey clearKey = cipherSuite.secretKeyFromBase64(encodedKey);
      
      assertEquals(secretKey, clearKey);
    }
  }
}
