/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.opp.Prototype;


import static org.junit.Assert.assertNotEquals;
import org.junit.Test;


public class PrototypeTest {

  @Test
  public void testPrototype() throws CloneNotSupportedException {


    Prototype prototype = new ConcretePrototype();

    Client client = new Client(prototype);


    Prototype prototypeClone = client.operation();


    assertNotEquals(prototype, prototypeClone);
  }
}