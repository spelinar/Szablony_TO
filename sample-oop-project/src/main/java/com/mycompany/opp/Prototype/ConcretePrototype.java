/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.opp.Prototype;

/**
 *
 * @author 4
 */
public class ConcretePrototype extends Prototype {
    public Prototype copyMe() throws CloneNotSupportedException {
    return (Prototype) this.clone();
  }
}
