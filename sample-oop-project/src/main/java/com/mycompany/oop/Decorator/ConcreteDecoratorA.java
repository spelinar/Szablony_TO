/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.Decorator;

/**
 *
 * @author 4
 */
public class ConcreteDecoratorA extends Decorator {

  private boolean state;

  public void operation() {
    state = true;
    this.component.operation();
  }

  public boolean isState() {
    return state;
  }
}