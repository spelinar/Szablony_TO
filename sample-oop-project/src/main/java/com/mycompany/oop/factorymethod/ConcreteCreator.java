/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.factorymethod;

/**
 *
 * @author 4
 */
public class ConcreteCreator extends Creator {

  public Product factoryMethod(String type) {

    if (type.equals("A")) {
      return new ConcreteProductA();
    } else if (type.equals("B")) {
      return new ConcreteProductB();
    }

    return null;
  }
    
}
