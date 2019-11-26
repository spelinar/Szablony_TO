/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.adapter;

/**
 *
 * @author 4
 */
public class Adapter {
    private Adaptee adaptee;

  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  public String request() {
    return adaptee.specialRequest();
  }
}
