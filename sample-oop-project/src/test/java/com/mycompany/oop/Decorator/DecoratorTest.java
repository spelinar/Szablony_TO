/*
 * @author Roman Spelina
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.Decorator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author 4
 */
public class DecoratorTest {

  @Test
  public void testDecorator() {

    Component component = new ConcreteComponent();

    Decorator decoratorA = new ConcreteDecoratorA();
    decoratorA.setComponent(component);
    decoratorA.operation();

    assertEquals(true, ((ConcreteDecoratorA) decoratorA).isState());
    Decorator decoratorB = new ConcreteDecoratorB();
    decoratorB.setComponent(component);
    assertEquals(false,((ConcreteDecoratorB) decoratorB).isBehaviorMethodInvoked());
    decoratorB.operation();
    assertEquals(true,((ConcreteDecoratorB) decoratorB).isBehaviorMethodInvoked());
  }
}