/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.pelnomocnik;

/**
 *
 * @author 4
 */
public class Proxy implements Subject {

  private RealSubject realSubject;

  public void doOperation() {
    this.realSubject = new RealSubject();
    this.realSubject.doOperation();
  }

  public RealSubject getRealSubject() {
    return realSubject;
  }
}