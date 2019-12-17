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
public class Receiver {

  private boolean operationPerfomed = false;

  public void action() {
    operationPerfomed = true;
  }

  protected boolean isOperationPerfomed() {
    return operationPerfomed;
  }
}
