/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.pelnomocnik;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author 4
 */
public class ProxyTest {

  @Test
  public void testProxy() {

    Proxy proxy = new Proxy();

  
    assertEquals(null, proxy.getRealSubject());

    proxy.doOperation();

    assertNotNull(proxy.getRealSubject());
  }
}
