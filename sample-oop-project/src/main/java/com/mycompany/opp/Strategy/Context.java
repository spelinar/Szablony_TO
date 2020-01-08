/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.opp.Strategy;

/**
 *
 * @author 4
 */
public class Context {

  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  protected String contextInterface() {
    return this.strategy.algorithmInterface();
  }
}
