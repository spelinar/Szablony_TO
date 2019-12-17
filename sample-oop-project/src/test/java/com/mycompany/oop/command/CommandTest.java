/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.command;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 4
 */
public class CommandTest {
    
  @Test
  public void testCommand() {

    Receiver receiver = new Receiver();
    Command command = new ConcreteCommand(receiver);
    Invoker invoker = new Invoker(command);

    assertEquals(false, receiver.isOperationPerfomed());
    invoker.execute();
    assertEquals(true, receiver.isOperationPerfomed());
  }
}
