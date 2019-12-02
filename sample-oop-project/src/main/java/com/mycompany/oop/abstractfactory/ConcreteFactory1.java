/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.abstractfactory;

/**
 *
 * @author 4
 */
public class ConcreteFactory1 implements AbstractFactory {

  public AbstractProductA createProductA() {
    return new ProductA1();
  }

  public AbstractProductB createProductB() {
    return new ProductB1();
  }
    
}
