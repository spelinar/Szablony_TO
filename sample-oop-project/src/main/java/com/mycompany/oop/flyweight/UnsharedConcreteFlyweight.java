/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.flyweight;

/**
 *
 * @author 4
 */
public class UnsharedConcreteFlyweight implements Flyweight {

  private Object state;

  public UnsharedConcreteFlyweight(Object state) {
    this.state = state;
  }

  public void operation(Object extrinsicState) {

  }

  public Object getState() {
    return state;
  }
}
