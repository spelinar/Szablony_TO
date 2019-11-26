/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.adapter;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.mycompany.oop.adapter.Adaptee;
import com.mycompany.oop.adapter.Adapter;
import com.mycompany.oop.adapter.Target;
/**
 *
 * @author 4
 */
public class AdapterTest {
    @Test
  public void testAdapter() {
      
    Adaptee adaptee = new Adaptee();

    Adapter target = new Adapter(adaptee);

    assertEquals("specialRequest", target.request());
  }
}
