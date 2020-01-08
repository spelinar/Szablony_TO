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
public class ConcreteAggregate implements Aggregate {

  private final String records[] = { "first", "second", "third", "fourth" };

  @Override
  public Iterator createIterator() {
    return new ConcreteIterator(this);
  }

  protected String[] getRecords() {
    return records;
  }
}
