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
public class ConcreteFlyweight implements Flyweight {

  private Object intrinsicState;

  public ConcreteFlyweight(Object intrinsicState) {
    this.intrinsicState = intrinsicState;
  }

  public void operation(Object extrinsicState) {
  }

 
  public Object getIntrinsicState() {
    return intrinsicState;
  }
}
