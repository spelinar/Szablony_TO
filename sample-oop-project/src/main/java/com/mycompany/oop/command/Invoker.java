/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.command;

/**
 *
 * @author 4
 */
public class Invoker {

  private final Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  public void execute() {
    command.execute();
  }
}
