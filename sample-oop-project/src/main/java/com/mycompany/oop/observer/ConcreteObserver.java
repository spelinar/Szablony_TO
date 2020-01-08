/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.observer;

/**
 *
 * @author 4
 */
public class ConcreteObserver implements Observer {

  private int observerState;

  private ConcreteSubject subject;

  public ConcreteObserver(ConcreteSubject subject) {
    this.subject = subject;
  }

  @Override
  public void update() {
    observerState = subject.getState();
  }

  protected int getObserverState() {
    return observerState;
  }
}
