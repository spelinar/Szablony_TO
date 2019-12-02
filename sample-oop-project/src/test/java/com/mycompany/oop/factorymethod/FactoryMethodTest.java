/* * @author Roman SPelina
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.factorymethod;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author 4
 */
public class FactoryMethodTest {

  @Test
  public void testFactoryMethod() {

    Creator factory = new ConcreteCreator();

    Product productA = factory.factoryMethod("A");
    Product productB = factory.factoryMethod("B");

    assertEquals("com.mycompany.oop.factorymethod.ConcreteProductA",
        productA.getClass().getName());
    assertEquals("com.mycompany.oop.factorymethod.ConcreteProductB",
        productB.getClass().getName());

    assertEquals(null, factory.factoryMethod(""));
  }
    
}
