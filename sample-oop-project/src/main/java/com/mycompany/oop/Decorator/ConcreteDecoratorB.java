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
public class ConcreteDecoratorB extends Decorator {

  private boolean behaviorMethodInvoked = false;

  public void operation() {
    this.component.operation();
    addedBehavior();
  }

  private void addedBehavior() {
    behaviorMethodInvoked = true;
  }

  protected boolean isBehaviorMethodInvoked() {
    return behaviorMethodInvoked;
  }
}
