/*
* @author Roman Spelina
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.Decorator;

/**
 *
 * @author 4
 */
abstract class Decorator implements Component {

  protected Component component;

  public abstract void operation();

  public void setComponent(Component component) {
    this.component = component;
  }
}
