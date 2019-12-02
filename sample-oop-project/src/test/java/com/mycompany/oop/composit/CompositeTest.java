/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.composit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 4
 */
public class CompositeTest {
    @Test
  public void testComposite() {

    Component leaf1 = new Leaf();
    Component leaf2 = new Leaf();
    Component leaf3 = new Leaf();

    Composite composite = new Composite();
    composite.add(leaf1);
    composite.add(leaf2);
    composite.add(leaf3);

    composite.operation();

    assertEquals(leaf1, composite.getChild(0));
    assertEquals(leaf2, composite.getChild(1));
    assertEquals(leaf3, composite.getChild(2));

    composite.remove(leaf1);

    assertEquals(leaf2, composite.getChild(0));
    assertEquals(leaf3, composite.getChild(1));
  }
}
    
   