/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.iterator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class IteratorTest {

  @Test
  public void testIterator() throws Exception {

    Aggregate aggregate = new ConcreteAggregate();

    Iterator iterator = aggregate.createIterator();

    assertEquals("first", iterator.first());
    assertEquals("first", iterator.currentItem());
    assertEquals(false, iterator.isDone());

    assertEquals("second", iterator.next());
    assertEquals("second", iterator.currentItem());
    assertEquals(false, iterator.isDone());

    assertEquals("third", iterator.next());
    assertEquals("third", iterator.currentItem());
    assertEquals(false, iterator.isDone());

    assertEquals("fourth", iterator.next());
    assertEquals("fourth", iterator.currentItem());
    assertEquals(true, iterator.isDone());
  }
}