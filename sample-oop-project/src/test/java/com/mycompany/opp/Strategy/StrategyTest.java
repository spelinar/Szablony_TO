/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.opp.Strategy;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author 4
 */
public class StrategyTest {

  @Test
  public void testStrategy() {

    Context context = new Context(new ConcreteStrategyA());
    assertEquals("Go to airport with ConcreteStrategyA, take a taxi",
        context.contextInterface());

    context = new Context(new ConcreteStrategyB());
    assertEquals("Go to airport with ConcreteStrategyB, take a bus",
        context.contextInterface());

    context = new Context(new ConcreteStrategyC());
    assertEquals("Go to airport with ConcreteStrategyC, take a metro",
        context.contextInterface());
  }
}