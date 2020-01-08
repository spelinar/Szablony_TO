/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.iterator;

/**
 *
 * @author 4
 */
public class ConcreteIterator implements Iterator {

  private ConcreteAggregate concreteAggregate;
  private int index = -1;

  public ConcreteIterator(ConcreteAggregate concreteAggregate) {
    this.concreteAggregate = concreteAggregate;
  }

  public Object first() {
    index = 0;
    return concreteAggregate.getRecords()[index];
  }

  public Object next() {
    index++;
    return concreteAggregate.getRecords()[index];
  }

  public boolean isDone() {

    if (concreteAggregate.getRecords().length == (index + 1)) {
      return true;
    }
    return false;
  }

  public Object currentItem() {
    return concreteAggregate.getRecords()[index];
  }
}
