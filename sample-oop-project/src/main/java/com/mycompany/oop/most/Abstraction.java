/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.most;

/**
 *
 * @author 4
 */
abstract class Abstraction {

  protected Implementor implementor;

  public Abstraction(Implementor implementor) {
    this.implementor = implementor;
  }

  abstract String operation();
}
