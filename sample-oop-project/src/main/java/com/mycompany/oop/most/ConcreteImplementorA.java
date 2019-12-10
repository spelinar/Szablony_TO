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
public class ConcreteImplementorA implements Implementor {

  public String implementation() {
    return this.getClass().getName();
  }
}
