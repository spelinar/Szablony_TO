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
public class ConcreteSubject extends Subject {

  private int state;

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
    this.notifyObervers();
  }
}
