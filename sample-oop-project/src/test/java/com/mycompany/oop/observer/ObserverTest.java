/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.observer;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author 4
 */
public class ObserverTest {

  @Test
  public void testObserver() throws CloneNotSupportedException {

    ConcreteSubject subject = new ConcreteSubject();
    Observer observer = new ConcreteObserver(subject);
    subject.attach(observer);
    subject.setState(1);
    assertEquals(1, ((ConcreteObserver) observer).getObserverState());
    subject.dettach(observer);
    subject.setState(0);
    assertEquals(1, ((ConcreteObserver) observer).getObserverState());
  }
}