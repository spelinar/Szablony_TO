/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.flyweight;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author 4
 */
public class FlyweightFactory {

  private static Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

  public static Flyweight getFlyweight(String key, String value) {

    if (key.startsWith("unshared")) {
      flyweights.put(key, new UnsharedConcreteFlyweight(value));
    } else {
      if (!flyweights.containsKey(key)) {
        flyweights.put(key, new ConcreteFlyweight(value));
      }
    }

    return (Flyweight) flyweights.get(key);
  }
}
