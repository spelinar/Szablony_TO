/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.observer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author 4
 */
abstract class Subject {

  private List<Observer> observers = new ArrayList<Observer>();

  public void attach(Observer observer) {
    observers.add(observer);
  }

  public void dettach(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObervers() {
    for (Iterator iterator = observers.iterator(); iterator.hasNext();) {
      Observer observer = (Observer) iterator.next();
      observer.update();
    }
  }
}