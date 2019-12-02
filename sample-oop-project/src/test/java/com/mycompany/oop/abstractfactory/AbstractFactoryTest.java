/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.abstractfactory;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author 4
 */
public class AbstractFactoryTest {

  @Test
  public void testAbstractFactory() {

    AbstractFactory abstractFactory1 = new ConcreteFactory1();
    AbstractFactory abstractFactory2 = new ConcreteFactory2();

    assertEquals("com.mycompany.oop.abstractfactory.ProductA1",
        abstractFactory1.createProductA().getClass().getName());
    assertEquals("com.mycompany.oop.abstractfactory.ProductB1",
        abstractFactory1.createProductB().getClass().getName());

    assertEquals("com.mycompany.oop.abstractfactory.ProductA2",
        abstractFactory2.createProductA().getClass().getName());
    assertEquals("com.mycompany.oop.bstractfactory.ProductB2",
        abstractFactory2.createProductB().getClass().getName());
  }
    
}
