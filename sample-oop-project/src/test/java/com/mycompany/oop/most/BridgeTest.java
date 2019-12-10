/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.most;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 4
 */
public class BridgeTest {

@Test
  public void testBuilder() {

    RefinedAbstraction refinedAbstractionA = new RefinedAbstraction(
        new ConcreteImplementorA());
    assertEquals("com.mycompany.oop.most.ConcreteImplementorA",
        refinedAbstractionA.operation());
    RefinedAbstraction refinedAbstractionB = new RefinedAbstraction(
        new ConcreteImplementorB());
    assertEquals("com.mycompany.oop.most.ConcreteImplementorB",
        refinedAbstractionB.operation());
  
}
}